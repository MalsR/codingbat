package string2;

public class RepeatFront {

//    Given a string and an int n, return a string made of the first n characters of the string,
//    followed by the first n-1 characters of the string, and so on.
//
//    You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
//
//    repeatFront("Chocolate", 4) → "ChocChoChC"
//    repeatFront("Chocolate", 3) → "ChoChC"
//    repeatFront("Ice Cream", 2) → "IcI"

    public String repeatFront(String str, int n) {
        StringBuilder result = new StringBuilder();

        //i = n, starting from n and working lower. Stop the loop when i == 1 substring(0, 1) will return the first Char
        for (int i = n; i >= 1; i--) {
            String substring = str.substring(0, i);
            result.append(substring);
        }

        return result.toString();
    }
}
