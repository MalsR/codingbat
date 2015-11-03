package logic2;

public class MakeChocolate {

//    We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
//    Return the number of small bars to use, assuming we always use big bars before small bars.
//    Return -1 if it can't be done.
//
//    makeChocolate(4, 1, 9) → 4
//    makeChocolate(4, 1, 10) → -1
//    makeChocolate(4, 1, 7) → 2

    public int makeChocolate(int small, int big, int goal) {

        int requiredBigBars = goal / 5;

        if ((5 * big + small) < goal) {
            //If the current combination falls short of goal
            return -1;
        } else if ((5 * big + small) == goal) {
            //If the current combination is an exact match of goal
            return small;
        } else {
            if (requiredBigBars < big) {
                //we have more big bars than we want to so check if we have small bars
                int requiredSmallBars = goal - (requiredBigBars * 5);
                return requiredSmallBars <= small ? requiredSmallBars : -1;
            } else {
                //we have less big bars, so check if goal can be met with the remaining short bars
                int requiredSmallBars = goal - (big * 5);
                return requiredSmallBars <= small ? requiredSmallBars : -1;
            }
        }
    }
}