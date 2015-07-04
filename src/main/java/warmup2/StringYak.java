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
            if ('y' == str.charAt(i)) {
                //then check if next->next-> is a k
                int nextNextIndexPosition = i + 2 > str.length() - 1 ? str.length() - 1 : i + 2;
                char nextNextChar = str.charAt(nextNextIndexPosition);
                if ('k' == nextNextChar) {
                    //then we need to reset i to skip
                    i = i + 2;
                } else {
                    result.append(str.charAt(i));
                }
            } else {
                result.append(str.charAt(i));
            }
        }

//        for (int i = 0; i < str.length(); i = i + 3) {
//            int endIndex = i + 3 > str.length() ? str.length() : i + 3;
//            String substring = str.substring(i, endIndex);
//
//            if ('y' == substring.charAt(0) && 'k' == substring.charAt(substring.length() - 1)) {
//                //then need to omit this
//            } else {
//                result.append(substring);
//            }
//
//
//        }
        return result.toString();
    }
}
