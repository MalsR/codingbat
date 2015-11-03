package string2;

public class DoubleChar {
//
//    Given a string, return a string where for every char in the original, there are two chars.
//
//    doubleChar("The") → "TThhee"
//    doubleChar("AAbb") → "AAAAbbbb"
//    doubleChar("Hi-There") → "HHii--TThheerree"

    public String doubleChar(String str) {
        final StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char charAtIndex = str.charAt(i);
            result.append(charAtIndex).append(charAtIndex);
        }

        return result.toString();
    }
}