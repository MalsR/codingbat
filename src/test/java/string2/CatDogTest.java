package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatDogTest {

    @Test
    public void returnsOneWhenWordsCatAndDogAppearExactlyOnce() {
        CatDog catDog = new CatDog();

        assertTrue("Expected to return true since words cat & dog appears only once", catDog.catDog("catdog"));
    }

    @Test
    public void returnsTwoWhenWordsCatAndDogAppearExactlyTwice() {
        CatDog catDog = new CatDog();

        assertTrue("Expected to return true since words cat & dog appears twice", catDog.catDog("Iamacataddogcatanddog"));
    }

    @Test
    public void returnsFalseWhenWordCatIsPresent() {
        CatDog catDog = new CatDog();

        assertFalse("Expected to return false since the word cat appears once", catDog.catDog("catdowg"));
    }

    @Test
    public void returnsFalseWhenWordDogIsPresent() {
        CatDog catDog = new CatDog();

        assertFalse("Expected to return false since only the word dog appears once", catDog.catDog("cadog"));
    }

    @Test
    public void returnsTrueWhenWordsCatAndDogAppearZeroTimes() {
        CatDog catDog = new CatDog();

        assertTrue("Expected to return true since words cat and dog appears '0' times", catDog.catDog(""));
    }

    @Test
    public void returnsTrueWhenStringLengthIsOne() {
        CatDog catDog = new CatDog();

        assertTrue("Expected to return true since words cat and dog appears '0' times", catDog.catDog("c"));
    }
}