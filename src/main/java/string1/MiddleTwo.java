package string1;

public class MiddleTwo {

//    Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
//    The string length will be at least 2.
//
//    middleTwo("string") → "ri"
//    middleTwo("code") → "od"
//    middleTwo("Practice") → "ct"

    public String middleTwo(String str) {
        if (str.length() > 2) {
            int startIndex = (str.length() / 2) - 1;
            int endIndex = (str.length() / 2) + 1;
            return str.substring(startIndex, endIndex);

        }

        return str;
    }
}
