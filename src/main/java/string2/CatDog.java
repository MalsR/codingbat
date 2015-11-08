package string2;

public class CatDog {

//    Return true if the string "cat" and "dog" appear the same number of times in the given string.
//
//    catDog("catdog") → true
//    catDog("catcat") → false
//    catDog("1cat1cadodog") → true

    public boolean catDog(String str) {

        int wordCatCount = 0;
        int wordDogCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char chatAtIndexI = str.charAt(i);

            if ((chatAtIndexI == 'c' || chatAtIndexI == 'd') && (i + 3 <= str.length())) {
                //starts with either a 'c' or 'd' so find if the next two chars form up 'cat' or 'dog
                String wordIncludingIndex = str.substring(i, i + 3);

                if ("cat".equals(wordIncludingIndex)) {
                    wordCatCount++;
                }

                if ("dog".equals(wordIncludingIndex)) {
                    wordDogCount++;
                }
            }
        }

        return wordCatCount == wordDogCount;
    }
}
