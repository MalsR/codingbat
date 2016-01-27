package string2;

import java.util.Set;
import java.util.TreeSet;

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
        Set<Integer> breadIndexes = new TreeSet<>();

        for (int i = 0; i < str.length(); i++) {
            if (i + 5 <= str.length()) {
                String substring = str.substring(i, i + 5);

                if (BREAD.equalsIgnoreCase(substring)) {
                    //Found instance of bread
                    breadIndexes.add(i);

                    //Small change to skip unnecessary substring
                    //So if we found instance of bread and we don't need to do a substring of the chars in bread but
                    //jump to the end of brea'd' and start from the next char after. Note bread = 5 chars but
                    //i += 4 and back in the loop it increments by 1, hence 5
                    i += 4;
                }
            }
        }

        int breadIndexesSize = breadIndexes.size();
        if (breadIndexes.isEmpty() || breadIndexesSize == 1) {
            return "";
        } else {
            Integer[] integers = breadIndexes.toArray(new Integer[breadIndexesSize]);
            //Start index of first appearance of bread
            Integer startIndex = integers[0] + 5;
            //End index of last appearance of bread
            Integer endIndex = integers[breadIndexesSize - 1];
            return str.substring(startIndex, endIndex);
        }
    }
}
