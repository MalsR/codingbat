package string1;

public class LastChars {

//    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
//    so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
//
//    lastChars("last", "chars") → "ls"
//    lastChars("yo", "java") → "ya"
//    lastChars("hi", "") → "h@"

    public String lastChars(String a, String b) {
        String updatedA = a.length() == 0 ? a + "@" : a;
        String updatedB = b.length() == 0 ? b + "@" : b;

        char aStringChar = updatedA.charAt(0);
        char bStringChar = updatedB.charAt(updatedB.length() - 1);

        return "" + aStringChar + bStringChar;
    }
}
