package warmup1;

public class DelDel {

//    Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
//    Otherwise, return the string unchanged.
//
//    delDel("adelbc") → "abc"
//    delDel("adelHello") → "aHello"
//    delDel("adedbc") → "adedbc"

    public String delDel(String str) {
        int stringLength = str.length();
        int startIndex = stringLength > 0 ? 1 : stringLength;
        int endIndex = stringLength >= 4 ? 4 : stringLength;
        String substring = str.substring(startIndex, endIndex);

        if ("del".equals(substring)) {
            return (str.substring(0,1) + str.substring(4, stringLength));
        }
        return str;
    }
}
