package string1;

public class MinCat {

//    Given two strings, append them together (known as "concatenation") and return the result.
//    However, if the strings are different lengths, omit chars from the longer string so it is the same
//    length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
//
//    minCat("Hello", "Hi") → "loHi"
//    minCat("Hello", "java") → "ellojava"
//    minCat("java", "Hello") → "javaello"

    public String minCat(String a, String b) {
        StringBuilder result = new StringBuilder();

        int minLength = Math.min(a.length(), b.length());

        if (a.length() != minLength){
            String updatedA = a.substring(a.length() - minLength, a.length());
            result.append(updatedA);
        } else {
            result.append(a);
        }

        if (b.length() != minLength) {
            String updatedB = b.substring(b.length() - minLength, b.length());
            result.append(updatedB);
        } else {
            result.append(b);
        }

        return result.toString();

    }

}
