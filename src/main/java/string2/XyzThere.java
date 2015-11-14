package string2;

public class XyzThere {

//    Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by
//    a period (.).
//
//    So "xxyz" counts but "x.xyz" does not.
//
//    xyzThere("abcxyz") → true
//    xyzThere("abc.xyz") → false
//    xyzThere("xyz.abc") → true

    public boolean xyzThere(String str) {

        boolean result = false;

        for (int i = 0; i < str.length(); i++) {
            char charAtIndex = str.charAt(i);

            if (charAtIndex == 'x' && (i + 3 <= str.length())) {

                //If i is zero then x is the start of the string OR check if the char before i is not full stop '.'
                if (i == 0 || '.' != str.charAt(i - 1)) {
                    String subString = str.substring(i, i + 3);

                    if ("xyz".equalsIgnoreCase(subString)) {
                        result = true;
                        break;
                    }
                }
            }
        }

        return result;
    }
}
