package warmup2;

public class Array123 {

//    Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
//
//    array123({1, 1, 2, 3, 1}) → true
//    array123({1, 1, 2, 4, 1}) → false
//    array123({1, 1, 2, 1, 2, 3}) → true

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 && (i+3 <= nums.length) ) {
                //then check if followed by 2 and 3
                int secondNumber = nums[i + 1];
                int thirdNumber = nums[i + 2];
                if (secondNumber == 2 && 3 == thirdNumber) {
                    return true;
                }
            }
        }
        return false;
    }
}
