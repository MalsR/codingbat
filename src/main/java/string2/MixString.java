package string2;

public class MixString {

//    Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
//    the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
//
//    mixString("abc", "xyz") → "axbycz"
//    mixString("Hi", "There") → "HTihere"
//    mixString("xxxx", "There") → "xTxhxexre"

    public String mixString(String a, String b) {

        if (b == null || b.length() == 0) {
            return a;
        }

        if (a == null || a.length() == 0) {
            return b;
        }

        StringBuilder result = new StringBuilder();

        if (a.length() > b.length()) {
            for (int i = 0; i < b.length(); i++) {
                result.append(a.charAt(i));
                result.append(b.charAt(i));
            }
            result.append(a.substring(b.length(), a.length()));

        } else {
            for (int i = 0; i < a.length(); i++) {
                result.append(a.charAt(i));
                result.append(b.charAt(i));
            }
            result.append(b.substring(a.length(), b.length()));

        }
        return result.toString();
    }
}