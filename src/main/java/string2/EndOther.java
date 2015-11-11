package string2;

public class EndOther {

//    Given two strings, return true if either of the strings appears at the very end of the other string,
//    ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
//
//    Note: str.toLowerCase() returns the lowercase version of a string.
//
//    endOther("Hiabc", "abc") → true
//    endOther("AbC", "HiaBc") → true
//    endOther("abc", "abXabc") → true

    public boolean endOther(String a, String b) {
        String lowerCaseA = a.toLowerCase();
        String lowerCaseB = b.toLowerCase();

        if (lowerCaseA.equals(lowerCaseB)) {
            return true;
        } else {
            //Did not move the below common code to separate method to keep it simple
            if (a.length() > b.length()) {
                int startIndex = a.length() - b.length();
                String subStringOfA = lowerCaseA.substring(startIndex, a.length());

                return subStringOfA.equals(lowerCaseB);

            } else {
                int startIndex = b.length() - a.length();
                String subStringOfB = lowerCaseB.substring(startIndex, b.length());

                return subStringOfB.equals(lowerCaseA);
            }
        }
    }
}
