package string1;

public class LastTwo {

//    Given a string of any length, return a new string where the last 2 chars, if present, are swapped,
//    so "coding" yields "codign".
//
//    lastTwo("coding") → "codign"
//    lastTwo("cat") → "cta"
//    lastTwo("ab") → "ba"

    public String lastTwo(String str) {
        if (str.length() >= 2) {
            char lastChar = str.charAt(str.length() - 1);
            char penultimateChar = str.charAt(str.length() - 2);

            if (str.length() == 2) {
                return "" + lastChar + penultimateChar;
            }

            String remainingString = str.substring(0, str.length() - 2);
            return remainingString + lastChar + penultimateChar;

        }

        return str;
    }
}
