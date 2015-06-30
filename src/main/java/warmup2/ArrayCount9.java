package warmup2;

public class ArrayCount9 {

//    Given an array of ints, return the number of 9's in the array.
//
//    arrayCount9({1, 2, 9}) → 1
//    arrayCount9({1, 9, 9}) → 2
//    arrayCount9({1, 9, 9, 3, 9}) → 3

    public int arrayCount9(int[] nums) {
        int numberOfNines = 0;

        for (int number : nums) {
            if (number == 9)
                numberOfNines = numberOfNines + 1;
        }
        return numberOfNines;
    }
}
