package warmup2;

public class StringBits {

//    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
//
//    stringBits("Hello") → "Hlo"
//    stringBits("Hi") → "H"
//    stringBits("Heeololeo") → "Hello"

    public String stringBits(String str) {
//        if (str != null && str.length() == 0) {
//            return "";
//        }

        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < str.length(); i += 2) {
            char charAtIndex = str.charAt(i);
            result.append(charAtIndex);
        }
        return result.toString();
    }
}
