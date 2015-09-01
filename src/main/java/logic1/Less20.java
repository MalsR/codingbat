package logic1;

public class Less20 {

//    Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
//
//    So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod
//
//                                                                                                                                                                             less20(18) → true
//    less20(19) → true
//    less20(20) → false

    public boolean less20(int n) {

        int remainder = n % 20;

        return (20 - remainder <= 2);
    }
}
