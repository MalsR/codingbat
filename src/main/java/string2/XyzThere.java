package string2;

public class XyzThere {

    private static final String XYZ = "xyz";

//    Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceded by
//    a period (.).
//
//    So "xxyz" counts but "x.xyz" does not.
//
//    xyzThere("abcxyz") → true
//    xyzThere("abc.xyz") → false
//    xyzThere("xyz.abc") → true

    public boolean xyzThere(String str) {

        boolean result = false;
        int length = str.length();

        for (int i = 0; i < length; i++) {
            char charAtIndex = str.charAt(i);

            if (charAtIndex == 'x' && nextThreeCharsDoesNotExceedStringLength(length, i)) {

                //If 'i' is zero then x cannot be preceded by '.' OR check if the char before i is not preceded by '.'
                if (i == 0 || characterIsNotPrecededByDotOperator(str, i)) {
                    String subString = str.substring(i, i + 3);

                    if (XYZ.equalsIgnoreCase(subString)) {
                        result = true;
                        break;
                    }
                }
            }
        }

        return result;
    }

    private boolean nextThreeCharsDoesNotExceedStringLength(int stringLength, int i) {
        return i + 3 <= stringLength;
    }

    private boolean characterIsNotPrecededByDotOperator(String str, int i) {
        return '.' != str.charAt(i - 1);
    }
}
