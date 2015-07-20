package string1;

public class WithoutX2 {

//    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
//    and otherwise return the string unchanged. This is a little harder than it looks.
//
//    withoutX2("xHi") → "Hi"
//    withoutX2("Hxi") → "Hi"
//    withoutX2("Hi") → "Hi"

    public String withoutX2(String str) {

        if (str.startsWith("x")) {
            str = str.substring(1, str.length());

            if (str.length() >= 1 && 'x' == str.charAt(0)) {
                str = str.substring(1, str.length());
            }
        } else if (str.length() != 0 && 'x' == str.charAt(1)) {
            str = str.charAt(0) + str.substring(2, str.length());
        }

        return str;
    }
}
