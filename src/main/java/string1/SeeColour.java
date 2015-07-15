package string1;

public class SeeColour {

//    Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
//
//    seeColor("redxx") → "red"
//    seeColor("xxred") → ""
//    seeColor("blueTimes") → "blue"

    public String seeColor(String str) {
        if (str.length() >= 3) {
            String toCompareForRed = str.substring(0, 3);
            if ("red".equalsIgnoreCase(toCompareForRed)) {
                return "red";
            }
            String toCompareForBlue = str.substring(0, str.length() == 3 ? 3 : 4);
            if ("blue".equalsIgnoreCase(toCompareForBlue))
                return "blue";
        }

        return "";
    }
}
