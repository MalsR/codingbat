package warmup1;

public class PosNeg {

//    Given 2 int values, return true if one is negative and one is positive.
//    Except if the parameter "negative" is true, then return true only if both are negative.
//
//    posNeg(1, -1, false) → true
//    posNeg(-1, 1, false) → true
//    posNeg(-4, -5, true) → true

    public boolean posNeg(int a, int b, boolean negative) {
//        if (negative && (a < 0 && b < 0)) {
//            return true;
//        } else if (!negative && (a < 0 && b < 0)) {
//            return false;
//        }  else if (!negative && (a > 0 && b > 0)) {
//            return false;
//        } else if (!negative && (a > 0 || b < 0)) {
//            return true;
//        } else if (!negative && (a < 0 || b > 0)) {
//            return true;
//        }
//        return false;

//        if (negative) {
//            return (a < 0 && b < 0);
//        } else if ((a < 0 && b < 0) || (a > 0 && b > 0)) {
//            return false;
//        } else if ((a > 0 || b < 0) || (a < 0 || b > 0)) {
//            return true;
//        }
//        return false;

        //can further simplify

        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }
}
