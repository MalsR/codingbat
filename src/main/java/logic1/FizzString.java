package logic1;

public class FizzString {

//    Given a string str, if the string starts with "f" return "Fizz".
//    If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
//    In all other cases, return the string unchanged. (See also: FizzBuzz Code)
//
//    fizzString("fig") → "Fizz"
//    fizzString("dib") → "Buzz"
//    fizzString("fib") → "FizzBuzz"

    public String fizzString(String str) {

        StringBuilder result = new StringBuilder();

        if (str.startsWith("f")) {
            result.append("Fizz");
        }

        if (str.endsWith("b")) {
            result.append("Buzz");
        }

        return result.length() == 0 ? str : result.toString();
    }
}
