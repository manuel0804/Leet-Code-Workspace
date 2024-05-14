package PlusOne;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestClass {
    @Test
    public void test1() {
        int[] input = {1,2,3};
        int[] expected = {1,2,4};
        int[] actual = PlusOne.plusOne(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        int[] input = {4,3,2,1};
        int[] expected = {4,3,2,2};
        int[] actual = PlusOne.plusOne(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        int[] input = {0};
        int[] expected = {1};
        int[] actual = PlusOne.plusOne(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test4(){
        int[] input = {9};
        int[] expected = {1,0};
        int[] actual = PlusOne.plusOne(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test5(){
        int[] input = {8,9};
        int[] expected = {9,0};
        int[] actual = PlusOne.plusOne(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test6(){
        int[] input = {9,9,9};
        int[] expected = {1,0,0,0};
        int[] actual = PlusOne.plusOne(input);
        assertArrayEquals(expected, actual);
    }

}
