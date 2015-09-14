package logic1;

public class NearTen {

//    Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
//    Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
//                                                                                                                                                                                         nearTen(12) → true
//    nearTen(17) → false
//    nearTen(19) → true

    public boolean nearTen(int num) {

        int closestTenMultiple = num/10 * 10;
        int remainder = num % 10;

        int diff;
        if (remainder < 8) {
            //if remainder is less than 8 then we are possibly over a multiple of 10 (based on our within 2, hence 8)
            diff = num - closestTenMultiple;
        } else {
            //less within a multiple of 10
            diff = 10 - remainder;
        }

        return diff <= 2;
    }
}