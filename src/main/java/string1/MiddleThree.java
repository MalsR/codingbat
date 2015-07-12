package string1;

public class MiddleThree {

//    Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
//    The string length will be at least 3.
//
//    middleThree("Candy") → "and"
//    middleThree("and") → "and"
//    middleThree("solving") → "lvi"

    public String middleThree(String str) {

        if (str.length() > 3) {
            int offSetCalculation = (str.length() - 3) / 2;
            return str.substring(offSetCalculation, str.length() - offSetCalculation);
        }

        return str;
    }
}
