package warmup1;

public class BackAround {

//    Given a string, take the last char and return a new string with the last char added at the front and back,
//    so "cat" yields "tcatt". The original string will be length 1 or more.
//
//    backAround("cat") → "tcatt"
//    backAround("Hello") → "oHelloo"
//    backAround("a") → "aaa"

    public String backAround(String str) {
        int stringLength = str.length();

        //System.out.println(str.substring(stringLength - 1));

        String lastChar = str.substring(stringLength - 1, stringLength);

        return lastChar + str + lastChar;
    }
}
