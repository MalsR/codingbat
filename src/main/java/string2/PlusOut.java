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

        StringBuilder result = new StringBuilder();

        if (str.contains(word)) {
            Set<Integer> characterIndexes = getIndexOfCharactersToExclude(str, word);

            //Iterate str and for each character index to exclude include the real character, else replace
            for (int i = 0; i <= str.length() - 1; i++) {
                if (characterIndexes.contains(i)) {
                    result.append(str.charAt(i));
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

    private Set<Integer> getIndexOfCharactersToExclude(String str, String word) {
        //Create set containing index of characters to exclude
        Set<Integer> characterIndexes = new HashSet<>();

        for (int i = 0; i <= str.length() - 1; i++) {
            char characterAtIndex = str.charAt(i);
            if (characterAtIndex == word.charAt(0)) {
                String substring = str.substring(i, i + word.length());
                if (word.equalsIgnoreCase(substring)) {
                    //Found match

                    characterIndexes.add(i);
                    for (int y = 1; y < word.length(); y++) {
                        characterIndexes.add(i+y);
                    }
                }
            }
        }
        return characterIndexes;
    }
}
