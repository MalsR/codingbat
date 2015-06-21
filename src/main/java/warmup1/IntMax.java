package warmup1;

import java.util.HashSet;
import java.util.Set;

public class IntMax {
//
//    Given three int values, a b c, return the largest.
//
//    intMax(1, 2, 3) → 3
//    intMax(1, 3, 2) → 3
//    intMax(3, 2, 1) → 3

    public int intMax(int a, int b, int c) {
//        Set<Integer> intSet = new HashSet<>();
//        intSet.add(a);
//        intSet.add(b);
//        intSet.add(c);
//
//        Integer[] intArray = intSet.toArray(new Integer[intSet.size()]);
//        return intArray[intArray.length -1];

        //Maybe something more straight forward
        int maxOfAOrB = Math.max(a, b);
        return Math.max(maxOfAOrB, c);
    }
}
