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
            if ( 'x'== charAtIndex && (i == 0 || i == str.length()-1) || 'x' != charAtIndex) {
                result.append(charAtIndex);
            }
        }
        return result.toString();
    }
}
