package logic2;

public class MakeBricks {

//    We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each)
//    and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
//
//    This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
//
//                                                                                                                                                                                                                                                                                                                                  makeBricks(3, 1, 8) → true
//    makeBricks(3, 1, 9) → false
//    makeBricks(3, 2, 10) → true

    public boolean makeBricks(int small, int big, int goal) {

        //small + (big * 5) < goal Goal is bigger than the combination of small and big bricks
        //goal % 5 > small We don't have sufficient small number of bricks to contruct the goal line
        if (small + (big * 5) < goal || goal % 5 > small) {
            return false;
        }

        return true;
    }
}
