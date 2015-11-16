package string2;

public class BobThere {

//    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
//
//    bobThere("abcbob") → true
//    bobThere("b9b") → true
//    bobThere("bac") → false

    public boolean bobThere(String str) {

        for (int i = 0; i < str.length(); i++) {
            char charAtIndex = str.charAt(i);

            if (charAtIndex == 'b' && i + 3 <= str.length()) {
                //Then string containing next two chars including i
                String substring = str.substring(i, i + 3);

                if (substring.charAt(2) == 'b') {
                    return true;
                }
            }
        }

        return false;
    }
}
