package warmup2;

public class StringYak {

//    Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
//    but the "a" can be any char. The "yak" strings will not overlap.
//
//    stringYak("yakpak") → "pak"
//    stringYak("pakyak") → "pak"
//    stringYak("yak123ya") → "123ya"

    public String stringYak(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if ('y' == str.charAt(i) && 'k' == getSecondCharFromIndex(str, i)) {
                //then we need to reset i to skip 'y-any other char-k'
                i = i + 2;
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    private char getSecondCharFromIndex(String str, int index) {
        //then check if next->next-> is a k index.e (index+2)
        int nextNextIndexPosition = index + 2 > str.length() - 1 ? str.length() - 1 : index + 2;
        return str.charAt(nextNextIndexPosition);
    }
}
