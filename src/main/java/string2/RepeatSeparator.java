package string2;

public class RepeatSeparator {

//    Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
//    separated by the separator string.
//
//    repeatSeparator("Word", "X", 3) → "WordXWordXWord"
//    repeatSeparator("This", "And", 2) → "ThisAndThis"
//    repeatSeparator("This", "And", 1) → "This"

    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append(word);

            if (isLastRepetition(count, i)) {
                //Don't want to add the separator in the last repetition
                result.append(sep);
            }
        }

        return result.toString();
    }

    //Probably don't need to extract this out but perhaps for readability sake, god sake Robert C. Martin
    private boolean isLastRepetition(int count, int i) {
        return i < (count - 1);
    }
}
