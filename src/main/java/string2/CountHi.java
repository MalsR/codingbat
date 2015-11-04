package string2;

public class CountHi {

//    Return the number of times that the string "hi" appears anywhere in the given string.
//
//    countHi("abc hi ho") → 1
//    countHi("ABChi hi") → 2
//    countHi("hihi") → 2

    public int countHi(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char charAtIndex = str.charAt(i);

            if (charAtIndex == 'h' && (i + 1) < str.length()) {
                //Then check next char
                char charAfterH = str.charAt(i + 1);
                if (charAfterH == 'i') {
                    count++;
                }
            }
        }

        return count;
    }
}
