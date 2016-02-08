package string2;

public class OneTwo {

//    Given a string, compute a new string by moving the first char to come after the next two chars,
//    so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd".
//
//    Ignore any group of fewer than 3 chars at the end.
//
//    oneTwo("abc") → "bca"
//    oneTwo("tca") → "cat"
//    oneTwo("tcagdo") → "catdog"

    public String oneTwo(String str) {
        StringBuilder result = new StringBuilder();

        if (str.length() < 3) {
            return result.toString();
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.length() - i < 3) {
                result.append(str.substring(i, str.length()));
                break;
            } else {
                char charAtIndex = str.charAt(i);
                result.append(str.substring(i+1, i+3));
                result.append(charAtIndex);

                i+=2;
            }
        }

        return result.toString();
    }
}
