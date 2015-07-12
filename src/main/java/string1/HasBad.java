package string1;

public class HasBad {

//    Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx"
//    or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
//
//    hasBad("badxx") → true
//    hasBad("xbadxx") → true
//    hasBad("xxbadxx") → false

    public boolean hasBad(String str) {
        for (int i = 0; i < str.length() - 2 && i < 2; i++) {
            if ("bad".equalsIgnoreCase(str.substring(i, i + 3))) {
                return true;
            }

        }
        return false;
    }
}
