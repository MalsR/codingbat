package warmup1;

public class EndUp {

//    Given a string, return a new string where the last 3 chars are now in upper case.
//    If the string has less than 3 chars, uppercase whatever is there.
//    Note that str.toUpperCase() returns the uppercase version of a string.
//
//    endUp("Hello") → "HeLLO"
//    endUp("hi there") → "hi thERE"
//    endUp("hi") → "HI"

    public String endUp(String str) {
        int stringLength = str.length();

        if (stringLength < 3) {
            return str.toUpperCase();
        } else {
            String upperCasePart = str.substring(stringLength - 3, stringLength).toUpperCase();
            String lowerCasePart = str.substring(0, stringLength - 3);
            return lowerCasePart + upperCasePart;
        }
    }
}
