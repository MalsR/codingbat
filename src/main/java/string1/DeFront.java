package string1;

public class DeFront {

//    Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and
//    keep the second char if it is 'b'. The string may be any length. Harder than it looks.
//
//    deFront("Hello") → "llo"
//    deFront("java") → "va"
//    deFront("away") → "aay"

    public String deFront(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= str.length() - 1; i++) {
            char charAtIndex = str.charAt(i);

            if (i <= 1) {
                if (i == 0 && charAtIndex == 'b') {
                    result.append(charAtIndex);
                } else if (i == 1 && charAtIndex == 'b') {
                    result.append(charAtIndex);
                }
            } else {
                result.append(charAtIndex);
            }

        }

        return result.toString();
    }

    //Another implementation 
    public String deFront2(String str) {
        StringBuilder result = new StringBuilder();

        if (str.length() >= 2) {
            String remainingString = result.substring(2, str.length());

            if (str.charAt(0) == 'a') {
                result.append(str.charAt(0));
            }

            if (str.charAt(1) == 'b') {
                result.append(str.charAt(1));
            }

            result.append(remainingString);

        }

        return result.toString();
    }
}
