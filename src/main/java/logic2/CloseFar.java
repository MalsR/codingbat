package logic2;

public class CloseFar {

//    Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
//    while the other is "far", differing from both other values by 2 or more.
//
//    Note: Math.abs(num) computes the absolute value of a number.
//
//    closeFar(1, 2, 10) → true
//    closeFar(1, 2, 3) → false
//    closeFar(4, 1, 3) → true

    public boolean closeFar(int a, int b, int c) {

        //quick and dirty solution
        int differenceAB = Math.abs(a - b);
        int differenceAC = Math.abs(a - c);
        int differenceBC = Math.abs(b - c);

        if (differenceAB == 1 || differenceAB == 0) {
            return differenceBC >= 2 && differenceAC >= 2;
        } else if (differenceAC == 1 || differenceAC == 0) {
            return differenceAB >= 2 && differenceBC >= 2;
        } else {
            return false;
        }
    }
}
