package string1;

public class WithoutEnd {

//    Given a string, return a version without the first and last char, so "Hello" yields "ell".
//    The string length will be at least 2.
//
//    withoutEnd("Hello") → "ell"
//    withoutEnd("java") → "av"
//    withoutEnd("coding") → "odin"

    public String withoutEnd(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < str.length() - 1; i++) {
            char charAtIndex = str.charAt(i);
            result.append(charAtIndex);
        }

        return result.toString();
    }

}
