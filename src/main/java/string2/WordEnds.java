package string2;

public class WordEnds {

//    Given a string and a non-empty word string, return a string made of each char just before and
//    just after every appearance of the word in the string.
//
//    Ignore cases where there is no char before or after the word,
//    and a char may be included twice if it is between two words.
//
//    wordEnds("abcXY123XYijk", "XY") → "c13i"
//    wordEnds("XY123XY", "XY") → "13"
//    wordEnds("XY1XY", "XY") → "11"

    public String wordEnds(String str, String word) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= str.length() - 1; i++) {
            //Check to ensure that no out of bounds exception on substring
            if (i + word.length() <= str.length() - 1) {
                String subStringToCheck = str.substring(i, i + word.length());

                if (word.equalsIgnoreCase(subStringToCheck)) {
                    //then we found a match and now check before and after chars (if applicable)
                    char beforeChar = str.charAt(i - 1);
                    char afterChar = str.charAt(i + word.length());
                    result.append(beforeChar);
                    result.append(afterChar);
                }
            }
        }

        return result.toString();
    }
}
