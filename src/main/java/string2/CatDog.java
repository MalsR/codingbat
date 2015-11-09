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
            char charAtIndex = str.charAt(i);

            if ((charAtIndex == 'c' || charAtIndex == 'd') && (i + 3 <= str.length())) {
                //if charAtIndex starts with either 'c' or 'd' then use substring to get the three letter word
                //which includes charAtIndex character
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
