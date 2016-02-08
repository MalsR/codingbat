package string2;

public class SameStarChar {

//    Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star,
//    they are the same.
//
//    sameStarChar("xy*yzz") → true
//    sameStarChar("xy*zzz") → false
//    sameStarChar("*xa*az") → true
//    Should return true when empty string

    public boolean sameStarChar(String str) {
        boolean result = false;

        if (str.length() == 0) {
            return true;
        }

        if (str.contains("*")) {
            //Has star now check
            for (int i = 0; i < str.length(); i++) {
                char charToCheck = str.charAt(i);

                //Simplify getting untidy
                if ('*' == charToCheck) {
                    if (i == 0 && str.length() == 1) {
                        return true;
                    }

                    int beforeIndex = i - 1;
                    int afterIndex = i + 1;
                    if (beforeAndAfterIndexIsWithinLength(beforeIndex, afterIndex, str.length())) {
                        result = str.charAt(beforeIndex) == str.charAt(afterIndex);
                    }
                }
            }
        }
        return result;
    }

    private boolean beforeAndAfterIndexIsWithinLength(int beforeIndex, int afterIndex, int stringLength) {
        return beforeIndex > 0 && afterIndex <= stringLength - 1;
    }
}
