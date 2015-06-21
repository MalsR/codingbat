package warmup1;

public class Close10 {

//    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
//    Note that Math.abs(n) returns the absolute value of a number.
//
//    close10(8, 13) → 8
//    close10(13, 8) → 8
//    close10(13, 7) → 0

    public int close10(int a, int b) {
        int firstArgumentAbsVal = Math.abs(10 - a);
        int secondArgumentAbsVal = Math.abs(10 - b);

        if (firstArgumentAbsVal < secondArgumentAbsVal) {
            return a;
        } else if (firstArgumentAbsVal > secondArgumentAbsVal) {
            return b;
        } else {
            return 0;
        }
    }
}