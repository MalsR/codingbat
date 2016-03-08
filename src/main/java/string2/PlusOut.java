package string2;

import java.util.HashSet;
import java.util.Set;

public class PlusOut {

    // Given a string and a non-empty word string,
    // return a version of the original String where all chars have been replaced by pluses ("+"),
    // except for appearances of the word string which are preserved unchanged.
    //
    // plusOut("12xy34", "xy") → "++xy++"
    // plusOut("12xy34", "1") → "1+++++"
    // plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"

    public String plusOut(String str, String word) {

        Set<Character> charsToExclude = new HashSet<>();
        for (int i = 0; i <= word.length() - 1; i++) {
            char characterAtIndex = word.charAt(i);
            charsToExclude.add(characterAtIndex);
        }

        StringBuilder result = new StringBuilder();
        if (str.contains(word)) {
            //
            for (int i = 0; i <= str.length() - 1; i++) {
                char characterAtIndex = str.charAt(i);
                if (charsToExclude.contains(characterAtIndex)) {
                    result.append(characterAtIndex);
                } else {
                    result.append("+");
                }
            }

        } else {

            for (int i = 0; i < str.length() - 1; i++) {
                result.append("+");
            }

        }
        return result.toString();
    }
}
