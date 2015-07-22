package array1;

public class BiggerTwo {

//    Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
//    Return the array which has the largest sum. In event of a tie, return a.

//    biggerTwo({1, 1}, {1, 2}) → {1, 2}
//    biggerTwo({3, 4}, {1, 2}) → {3, 4}
//    biggerTwo({1, 2}, {3, 4}) → {3, 4}

    public int[] biggerTwo(int[] a, int[] b) {
        int sumOfA = 0;
        for (int number : a) {
            sumOfA = sumOfA + number;
        }

        int sumOfB = 0;
        for (int number : b) {
            sumOfB = sumOfB + number;
        }

        return (sumOfA == sumOfB ? a : Math.max(sumOfA, sumOfB) == sumOfA ? a : b);
    }
}
