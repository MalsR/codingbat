package warmup2;

public class DoubleX {

//    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
//
//    doubleX("axxbb") → true
//    doubleX("axaxax") → false
//    doubleX("xxxxx") → true

    boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if ('x' == str.charAt(i)) {
                int endIndex = i + 2 > str.length() ? str.length() : i + 2;
                String stringToTest = str.substring(i, endIndex);
                return "xx".equals(stringToTest);
            }
        }
        return false;
    }
}
