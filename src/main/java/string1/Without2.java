package string1;

public class Without2 {
//
//    Given a string, if a length 2 substring appears at both its beginning and end,
//    return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
//    The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
//
//    without2("HelloHe") → "lloHe"
//    without2("HelloHi") → "HelloHi"
//    without2("Hi") → ""

    public String without2(String str) {
        if (str.length() >= 2) {
            String lastPair = str.substring(str.length() - 2, str.length());

            if (str.startsWith(lastPair)) {
                return str.substring(2, str.length());
            } else {
                return str;
            }
        }

        return str;
    }
}