package warmup2;

public class StringSpolsion {

//    Given a non-empty string like "Code" return a string like "CCoCodCode".
//
//    stringSplosion("Code") → "CCoCodCode"
//    stringSplosion("abc") → "aababc"
//    stringSplosion("ab") → "aab"

    public String stringSplosion(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++) {
            int endIndex = i + 1 > str.length() ? str.length() : i + 1;
            String substring = str.substring(0, endIndex);
            result.append(substring);
        }

        result.append(str);

        return result.toString();
    }
}
