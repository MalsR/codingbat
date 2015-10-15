package logic2;

public class LoneSum {

//    Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
//    it does not count towards the sum.
//
//    loneSum(1, 2, 3) → 6
//    loneSum(3, 2, 3) → 2
//    loneSum(3, 3, 3) → 0

    public int loneSum(int a, int b, int c) {

        if (a != b && a != c && b != c) {
            return (a + b + c);
        } else if (a == b && a != c) {
            return c;
        } else if (b == c && b != a) {
            return a;
        } else if (c == a && a != b) {
            return b;
        } else {
            return 0;
        }
    }
}
