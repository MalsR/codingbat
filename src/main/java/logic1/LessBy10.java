package logic1;

public class LessBy10 {

//    Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
//
//    lessBy10(1, 7, 11) → true
//    lessBy10(1, 7, 10) → false
//    lessBy10(11, 1, 7) → true

    public boolean lessBy10(int a, int b, int c) {
        int abDiff = Math.abs(a - b);
        int bcDiff = Math.abs(b - c);
        int acDiff = Math.abs(a - c);

        return acDiff >= 10 || bcDiff >= 10 || abDiff >= 10;
    }
}
