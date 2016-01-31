package string2;

public class SameStarChar {

//    Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star,
//    they are the same.
//
//    sameStarChar("xy*yzz") → true
//    sameStarChar("xy*zzz") → false
//    sameStarChar("*xa*az") → true

    public boolean sameStarChar(String str) {

        if (str.contains("*")) {
            //Has star now check
            for (int i = 0; i < str.length(); i++) {
                char charToCheck = str.charAt(i);

                //Simplify
                if ('*' == charToCheck && i != 0) {
                    int beforeIndex = i - 1;
                    int afterIndex = i + 1;
                    if (str.charAt(beforeIndex) == str.charAt(afterIndex)) {
                        return true;
                    }
                }

            }
        } else {
            return false;
        }

        return false;
    }
}
