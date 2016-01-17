package string2;

public class PrefixAgain {

//    Given a string, consider the prefix string made of the first N chars of the string.
//    Does that prefix string appear somewhere else in the string?
//    Assume that the string is not empty and that N is in the range 1..str.length().
//
//    prefixAgain("abXYabc", 1) → true
//    prefixAgain("abXYabc", 2) → true
//    prefixAgain("abXYabc", 3) → false

    public boolean prefixAgain(String str, int n) {

        if (n > str.length()) {
            throw new IllegalArgumentException("Prefix length is greater than string length");
        }

        String stringPrefix = str.substring(0, n).toLowerCase();
        String remainingString = str.substring(n, str.length()).toLowerCase();

        return remainingString.contains(stringPrefix);
    }

    //Using substring
    public boolean prefixAgain2(String str, int n) {

        if (n > str.length()) {
            throw new IllegalArgumentException("Prefix length is greater than string length");
        }

        String stringPrefix = str.substring(0, n).toLowerCase();
        int stringPrefixLength = stringPrefix.length();
        String remainingString = str.substring(n, str.length()).toLowerCase();

        for (int i = 0; i < remainingString.length(); i++) {
            if (i + stringPrefixLength <= remainingString.length()) {
                String subStringToCompare = remainingString.substring(i, i + stringPrefixLength);

                if (stringPrefix.equalsIgnoreCase(subStringToCompare)) {
                    return true;
                }
            }
        }

        return false;
    }
}
