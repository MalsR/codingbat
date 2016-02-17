package string2;

public class ZipZap {

//    Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
//    Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
//
//    zipZap("zipXzap") → "zpXzp"
//    zipZap("zopzop") → "zpzp"
//    zipZap("zzzopzop") → "zzzpzp"

    public String zipZap(String str) {

        if (str.contains("zip") || str.contains("zap")) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i <= str.length() - 1; i++) {
                char charAtIndex = str.charAt(i);

                if ('z' == charAtIndex) {
                    //Now check for the next next char
                    char nextNextChar = str.charAt(i + 2);
                    if (nextNextChar == 'p') {
                        result.append(charAtIndex);
                        result.append(nextNextChar);
                        i = i + 2;
                    } else {
                        result.append(charAtIndex);
                    }
                } else {
                    result.append(charAtIndex);
                }

            }
            return result.toString();
        } else {
            return str;
        }
    }
}
