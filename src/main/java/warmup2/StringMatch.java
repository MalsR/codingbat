package warmup2;

public class StringMatch {

//    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
//    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
//
//    stringMatch("xxcaazz", "xxbaaz") → 3
//    stringMatch("abc", "abc") → 2
//    stringMatch("abc", "axc") → 0

    //Another simpler way
    public int stringMatch(String a, String b) {
        int maxLengthToIterate = Math.min(a.length(), b.length());
        int matchingSubStrings = 0;

        for (int i = 0; i < maxLengthToIterate - 1; i++) {
            String stringASubString = a.substring(i, i + 2);
            String stringBSubString = b.substring(i, i + 2);

            if (stringASubString.equals(stringBSubString)) {
                matchingSubStrings++;
            }
        }

        return matchingSubStrings;
    }

    public int stringMatch2(String a, String b) {
        int numberOfMatchingSubString = 0;

        for (int i = 0; i < a.length() - 1; i++) {
            String stringToCompare = a.substring(i, i + 2);

            //If string b is empty and length is less than string a's length, only want to compare if i is less than 2
            // of b's length
            if (b != null && b.length() >= 2 && i <= b.length() - 2) {
                int endIndexOfB = i + 2 > b.length() ? b.length() : i + 2;
                String stringToCompareB = b.substring(i, endIndexOfB);

                if (stringToCompare.equals(stringToCompareB)) {
                    numberOfMatchingSubString = numberOfMatchingSubString + 1;
                }
            }
        }
        return numberOfMatchingSubString;
    }
}
