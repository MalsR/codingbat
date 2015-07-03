package warmup2;

public class StringX {

//    Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or
//    end should not be removed.
//
//    stringX("xxHxix") → "xHix"
//    stringX("abxxxcd") → "abcd"
//    stringX("xabxxxcdx") → "xabcdx"

    public String stringX(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char charAtIndex = str.charAt(i);
            if ( isXCharAtStartOrEnd(str, i, charAtIndex) || 'x' != charAtIndex) {
                result.append(charAtIndex);
            }
        }
        return result.toString();
    }

    private boolean isXCharAtStartOrEnd(String str, int i, char charAtIndex) {
        return 'x'== charAtIndex && (i == 0 || i == str.length()-1);
    }
}