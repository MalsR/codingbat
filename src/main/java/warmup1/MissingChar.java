package warmup1;

public class MissingChar {

//    Given a non-empty string and an int n, return a new string where the char at index n has been removed.
//    The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
//
//    missingChar("kitten", 1) → "ktten"
//    missingChar("kitten", 0) → "itten"
//    missingChar("kitten", 4) → "kittn"

    public String missingChar(String str, int n) {
//        StringBuilder updatedString = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            if (i != n) {
//                char charAtIndex = str.charAt(i);
//                updatedString.append(String.valueOf(charAtIndex));
//            }
//        }
//
//        return updatedString.toString();

        //Another nicer way perhaps - assuming that n is always inclusive of str length
        System.out.println(str.length());

        String firstPart = str.substring(0, n);
        String secondPart = str.substring(n+1, str.length());

        return firstPart + secondPart;
    }
}
