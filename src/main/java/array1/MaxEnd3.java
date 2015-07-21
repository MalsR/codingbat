package array1;

import java.util.Arrays;

public class MaxEnd3 {

//    Given an array of ints length 3, figure out which is larger between the first and last elements in the array,
//    and set all the other elements to be that value. Return the changed array.
//
//    maxEnd3({1, 2, 3}) → {3, 3, 3}
//    maxEnd3({11, 5, 9}) → {11, 11, 11}
//    maxEnd3({2, 11, 3}) → {3, 3, 3}

    public int[] maxEnd3(int[] nums) {
        int maxNumber = Math.max(nums[0], nums[nums.length-1]);

        //Return the changed array
        nums[0] = maxNumber;
        nums[1] = maxNumber;
        nums[2] = maxNumber;
        return nums;
    }
}
