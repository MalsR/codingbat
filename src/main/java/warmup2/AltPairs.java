package warmup2;

public class AltPairs {

//    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
//
//    altPairs("kitten") → "kien"
//    altPairs("Chocolate") → "Chole"
//    altPairs("CodingHorror") → "Congrr"

    public String altPairs(String str) {
        int stringLength = str.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < stringLength; i+=4) {
            int endIndex = i + 2;

            if (endIndex <= stringLength) {
                String substring = str.substring(i, endIndex);
                result.append(substring);
            } else {
                char charAtIndex = str.charAt(i);
                result.append(charAtIndex);
            }
        }

        return result.toString();
    }
}
