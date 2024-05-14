package LongestCommonPrefix;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class Testing {
    @Test
    public void test1(){
        String[] words = {"flower","flow","flight"};
        String result = Main.longestCommonPrefix(words);
        String expected = "fl";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test2(){
        String[] words = {"dog","racecar","car"};
        String result = Main.longestCommonPrefix(words);
        String expected = "";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test3(){
        String[] words = {"dog","dog","dog"};
        String result = Main.longestCommonPrefix(words);
        String expected = "dog";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test4(){
        String[] words = {"dog","dog",""};
        String result = Main.longestCommonPrefix(words);
        String expected = "";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test5(){
        String[] words = {"oma","opa","otto"};
        String result = Main.longestCommonPrefix(words);
        String expected = "o";
        Assertions.assertEquals(expected, result);
    }

}
