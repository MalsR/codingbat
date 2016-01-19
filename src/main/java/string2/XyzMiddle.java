package string2;

public class XyzMiddle {

//    Given a string, does "xyz" appear in the middle of the string?
//    To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
//    This problem is harder than it looks.
//
//    xyzMiddle("AAxyzBB") → true
//    xyzMiddle("AxyzBB") → true
//    xyzMiddle("AxyzBBB") → false

    public boolean xyzMiddle(String str) {
        if (str.length() < 3) {
            return false;
        }

        int midLengthOfString = str.length() / 2;
        String xyz = "xyz";

        if (str.length() % 2 == 0) {
            String subStringCloseToLeft = str.substring(midLengthOfString - 2, midLengthOfString + 1);
            String subStringCloseToRight = str.substring(midLengthOfString - 1, midLengthOfString + 2);

            return subStringCloseToLeft.equalsIgnoreCase(xyz) || subStringCloseToRight.equalsIgnoreCase(xyz);
        } else {
            //For even numbers, 9/2 = 4 + 1
            int middleIndex = midLengthOfString + 1;
            String substring = str.substring(middleIndex - 2, middleIndex + 1);

            return substring.equalsIgnoreCase(xyz);
        }
    }
}
