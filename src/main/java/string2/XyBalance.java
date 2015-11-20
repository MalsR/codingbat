package string2;

public class XyBalance {

//    We'll say that a String is xy-balanced if for all the 'x' chars in the string,
//    there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not.
//
//    One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
//
//    xyBalance("aaxbby") → true
//    xyBalance("aaxbb") → false
//    xyBalance("yaaxbb") → false

    public boolean xyBalance(String str) {

        if (str != null && str.length() != 0) {
            int rightMostXIndex = -1;

            //Find the index of the right most 'x'
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == 'x') {
                    rightMostXIndex = i;
                }
            }

            if (rightMostXIndex >= 0) {
                //Now find if there is a y after this index
                for (int i = rightMostXIndex; i <= str.length() - 1; i++) {
                    if (str.charAt(i) == 'y') {
                        return true;
                    }
                }
                return false;
            }
        }
        
        return true;
    }
}