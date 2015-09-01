package logic1;

public class Old35 {

//    Return true if the given non-negative number is a multiple of 3 or 5, but not both.
//
//    Use the % "mod" operator -- see Introduction to Mod
//
//    old35(3) → true
//    old35(10) → true
//    old35(15) → false

    public boolean old35(int n) {
        int threeRemainder = n % 3;
        int fiveRemainder = n % 5;

        boolean multipleOfThree = threeRemainder == 0 && fiveRemainder != 0;
        boolean multipleOfFive = threeRemainder != 0 && fiveRemainder == 0;

        return (multipleOfThree || multipleOfFive);
    }
}
