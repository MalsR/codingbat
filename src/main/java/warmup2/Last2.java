package warmup2;

public class Last2 {

//    Given a string, return the count of the number of times that a substring length 2 appears in the string and
//    also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
//
//    last2("hixxhi") → 1
//    last2("xaxxaxaxx") → 1
//    last2("axxxaaxx") → 2

    public int last2(String str) {
        int numberOfLengthTwoSubStrings = 0;

        if (str.length() > 1) {
            int startIndex = str.length() - 2;
            String stringToCheck = str.substring(startIndex, str.length());

            for (int i = 0; i < str.length() - 1; i++) {
                int endIndex = i + 2;
                if (endIndex < str.length()) {
                    String nextTwoSubString = str.substring(i, endIndex);
                    if (nextTwoSubString.equals(stringToCheck)) {
                        numberOfLengthTwoSubStrings = numberOfLengthTwoSubStrings + 1;
                    }
                }
            }
        }
        return numberOfLengthTwoSubStrings;
    }
}
