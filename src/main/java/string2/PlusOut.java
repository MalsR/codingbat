package string2;

public class PlusOut {

    // Given a string and a non-empty word string,
    // return a version of the original String where all chars have been replaced by pluses ("+"),
    // except for appearances of the word string which are preserved unchanged.
    //
    // plusOut("12xy34", "xy") → "++xy++"
    // plusOut("12xy34", "1") → "1+++++"
    // plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"

    public String plusOut(String str, String word) {

        if (str.contains(word)) {
            throw new IllegalStateException("Implement happy case");
        } else {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < str.length() - 1; i++) {
                result.append("+");
            }

            return result.toString();
        }
    }
}
