package warmup1;

public class MixStart {

//    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
//
//    mixStart("mix snacks") → true
//    mixStart("pix snacks") → true
//    mixStart("piz snacks") → false

    public boolean mixStart(String str) {
        if (str.length() > 0) {
            int endIndex = str.length() >= 3 ? 3 : str.length();
            String stringToCompare = str.substring(1, endIndex);
            return "ix".equals(stringToCompare);
        }
        return false;
    }
}
