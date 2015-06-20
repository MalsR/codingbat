package warmup1;

public class StartHi {

//    Given a string, return true if the string starts with "hi" and false otherwise.
//
//    startHi("hi there") → true
//    startHi("hi") → true
//    startHi("hello hi") → false

    public boolean startHi(String str) {
//        int stringLength = str.length();
//
//        if (stringLength >= 2) {
//            String frontTwoChars = str.substring(0, 2);
//            return ("hi".equals(frontTwoChars));
//        } else {
//            return false;
//        }

        //Another simplified way
        int stringLength = str.length();
        int endIndex = stringLength >= 2 ? 2 : stringLength;

        String frontTwoChars = str.substring(0, endIndex);
        return ("hi".equals(frontTwoChars));
    }
}
