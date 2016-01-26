package string2;

public class SandwichBread {
    private static final String BREAD = "bread";

//    A sandwich is two pieces of bread with something in between.
//    Return the string that is between the first and last appearance of "bread" in the given string,
//    or return the empty string "" if there are not two pieces of bread.
//
//    getSandwich("breadjambread") → "jam"
//    getSandwich("xxbreadjambreadyy") → "jam"
//    getSandwich("xxbreadyy") → ""

    public String getSandwich(String str) {
        int startIndexOfFirst = 0;
        int endIndexOfFirst = 0;
        boolean foundFirstInstance = false;

        for (int i = 0; i < str.length(); i++) {
            if (i + 5 <= str.length()) {
                String substring = str.substring(i, i + 5);

                if (BREAD.equalsIgnoreCase(substring)) {
                    //Found instance of bread
                    if (!foundFirstInstance) {
                        startIndexOfFirst = i;
                        foundFirstInstance = true;
                    } else {
                        endIndexOfFirst = i;
                        return str.substring(startIndexOfFirst + 5, endIndexOfFirst);
                    }
                }
            }
        }

        return "";
    }
}
