package PascalTriangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PascalTest {

    @Test
    public void test1(){
        int[][] expected = {{1}};
        int[][] actual = PascalTriangle.pascal(1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        int[][] expected = {{1}, {1,1}};
        int[][] actual = PascalTriangle.pascal(2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        int[][] expected = {{1}, {1,1}, {1,2,1}};
        int[][] actual = PascalTriangle.pascal(3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test4(){
        int[][] expected = {{1}, {1,1}, {1,2,1}, {1,3,3,1}};
        int[][] actual = PascalTriangle.pascal(4);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test5(){
        int[][] expected = {{1}, {1,1}, {1,2,1}, {1,3,3,1}, {1,4,6,4,1}};
        int[][] actual = PascalTriangle.pascal(5);
        assertArrayEquals(expected, actual);
    }
}
