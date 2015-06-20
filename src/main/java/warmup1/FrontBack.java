package warmup1;

public class FrontBack {

//    Given a string, return a new string where the first and last chars have been exchanged.
//
//    frontBack("code") → "eodc"
//    frontBack("a") → "a"
//    frontBack("ab") → "ba"

    public String frontBack(String str) {

        int stringLength = str.length();
//
//        if (stringLength <= 1) {
//            return str;
//        } else {
//            String firstChar = str.substring(0, 1);
//
//            String lastChar = str.substring(stringLength - 1, stringLength);
//
//            String middleChars = str.substring(1, stringLength - 1);
//            return (lastChar + middleChars + firstChar);
//        }

        //Another
        if (stringLength <= 1) {
            return str;
        } else {
            String middlePart = str.substring(1, stringLength -1);
            return str.charAt(stringLength - 1) + middlePart + str.charAt(0);
        }
    }

}
