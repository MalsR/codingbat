package warmup1;

public class LastDigit {

//    Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
//    Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
//
//    lastDigit(7, 17) → true
//    lastDigit(6, 17) → false
//    lastDigit(3, 113) → true

    public boolean lastDigit(int a, int b) {
        if (a < 0 || b < 0) {
            return false;
        }

        int aLastDigit = a % 10;
        int bLastDigit = b % 10;
        return aLastDigit == bLastDigit;
    }
}
