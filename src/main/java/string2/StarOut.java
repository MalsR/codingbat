package string2;

import java.util.HashSet;
import java.util.Set;

public class StarOut {

//    Return a version of the given string, where for every star (*) in the string the star and the chars immediately
//    to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
//
//    starOut("ab*cd") → "ad"
//    starOut("ab**cd") → "ad"
//    starOut("sm*eilly") → "silly"

    public String starOut(String str) {

        Set<Integer> indexesToRemove = new HashSet<>();

        for (int i = 0; i <= str.length() - 1; i++) {
            char charAtIndex = str.charAt(i);

            if ('*' == charAtIndex) {
                int indexBeforeStar = i - 1;
                int indexAfterStar = i + 1;

                indexesToRemove.add(indexBeforeStar);
                indexesToRemove.add(indexAfterStar);
                indexesToRemove.add(i);
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!indexesToRemove.contains(i)) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}
