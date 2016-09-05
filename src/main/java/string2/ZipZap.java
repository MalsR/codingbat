package string2;

public class ZipZap {

//    Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
//    Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
//
//    zipZap("zipXzap") → "zpXzp"
//    zipZap("zopzop") → "zpzp"
//    zipZap("zzzopzop") → "zzzpzp"

    public String zipZap(String str) {

        StringBuilder result = new StringBuilder();
        int stringLengthToCheck = str.length() - 1;

        for (int i = 0; i <= stringLengthToCheck; i++) {
            char charAtIndex = str.charAt(i);

            if ('z' == charAtIndex && doesGivenIndexPositionEndWithCharacterP(str, i + 2)) {
                result.append("zp");
                //Add 2 to i so we do not check for 'p' and move to next
                i += 2;
            } else {
                result.append(charAtIndex);
            }
        }

        return result.toString();
    }

    private boolean doesGivenIndexPositionEndWithCharacterP(String stringToCheck, int indexPosition) {
        int stringLength = stringToCheck.length();

        return stringLength - 1 >= indexPosition && 'p' == stringToCheck.charAt(indexPosition);
    }
}
