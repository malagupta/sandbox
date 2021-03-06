package me.markoutte.sandbox.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class StringTest {

    private static final String string =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
                    "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                    "nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequa" +
                    "t. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum do" +
                    "lore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proide" +
                    "nt, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    private static final String pattern = "minim";;
    private static final int result = 135;

    @Test
    public void javaStringSearch() {
        Assert.assertEquals(result, string.indexOf(pattern));
    }

    @Test
    public void naiveStringSearch() {
        Assert.assertEquals(result, new NaiveSearch().find(pattern, string));
    }

    @Test
    public void boyerMooreSearch() {
        Assert.assertEquals(result, new BoyerMooreSearch().find(pattern, string));
    }

    @Test
    public void knuthMorrisPrattSearch() {
        Assert.assertEquals(result, new KnuthMorrisPrattSearch().find(pattern, string));
    }

    @Test
    public void rabinKarpSearch() {
        Assert.assertEquals(result, new RabinKarpSearch().find(pattern, string));
    }
}
