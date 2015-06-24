package warmup2;

public class StringTimes {

//    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//
//    stringTimes("Hi", 2) → "HiHi"
//    stringTimes("Hi", 3) → "HiHiHi"
//    stringTimes("Hi", 1) → "Hi"

    public String stringTimes(String str, int n) {
        if ((str != null && str.length() == 0)) {
            return str;
        } else {
            String updatedString = "";
            for (int i = 1; i <= n; i++) {
                updatedString = updatedString + str;
            }
            return updatedString;
        }
    }
}
