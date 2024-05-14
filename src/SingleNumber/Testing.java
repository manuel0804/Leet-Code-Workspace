package SingleNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Testing {
    @Test
    public void test1() {
        int[] input = {1,2,2,1,4,4,5,5,3};
        int expected = 3;
        int actual = Main.findSingleNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        int[] input = {1,2,3,2,1,4,4,5,5,3};
        int expected = 0;
        int actual = Main.findSingleNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        int[] input = {1,2,3,2,1,4,4,5,5,3,10,6,6,7,7,8,8,9,9};
        int expected = 10;
        int actual = Main.findSingleNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        int[] input = {11,2,3,2,1,4,4,5,5,3,10,6,6,7,7,8,8,9,9,10};
        int expected = 11;
        int actual = Main.findSingleNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        int[] input = {11,2,3,2,1,4,4,5,5,3,10,6,6,7,7,8,1,8,9,9,10,11,12};
        int expected = 12;
        int actual = Main.findSingleNumber(input);
        assertEquals(expected, actual);
    }
}
