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
        if (str.length() % 2 == 0) {
            String subStringCloseToLeft = str.substring(str.length() / 2 - 2, str.length() / 2 + 1);
            String subStringCloseToRight = str.substring(str.length() / 2 - 1, str.length() / 2 + 2);

            return subStringCloseToLeft.equalsIgnoreCase("xyz") || subStringCloseToRight.equalsIgnoreCase("xyz");

        } else {
            int middleIndex = str.length() / 2 + 1;
            String substring = str.substring(middleIndex - 2, middleIndex + 1);
            return substring.equalsIgnoreCase("xyz");
        }
    }
}
