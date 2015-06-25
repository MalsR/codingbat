package warmup2;

public class CountXX {

//    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
//
//    countXX("abcxx") → 1
//    countXX("xxx") → 2
//    countXX("xxxx") → 3

    int countXX(String str) {
        int overlappingXX = 0;

//        if (str != null && str.length() > 0) {
//            for (int i = 0; i < str.length(); i++) {
//                char charAtIndex = str.charAt(i);
//                if ('x' == charAtIndex) {
//                    if (i != 0 && 'x' == str.charAt( i - 1))
//                    overlappingXX++;
//                }
//            }
//        }

        //Simpler solution
        for (int i = 0; i < str.length() - 1; i++) {
            String pairToCompare = str.substring(i, i + 2);
            if ("xx".equals(pairToCompare)) {
                overlappingXX++;
            }
        }
        return overlappingXX;
    }
}
