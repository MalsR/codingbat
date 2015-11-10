package string2;

public class CountCode {

//    Return the number of times that the string "code" appears anywhere in the given string,
//    except we'll accept any letter for the 'd', so "cope" and "cooe" count.
//
//    countCode("aaacodebbb") → 1
//    countCode("codexxcode") → 2
//    countCode("cozexxcope") → 2

    public int countCode(String str) {

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char charAtIndex = str.charAt(i);

            if (charAtIndex == 'c' && (i + 4) <= str.length()) {
                //Then use substring to get string that includes the 4 next chars including the charAtIndex
                String subStringWord = str.substring(i, i + 4);

                if (subStringWord.charAt(1) == 'o' && subStringWord.charAt(3) == 'e') {
                    result++;
                }
            }
        }

        return result;
    }
}
