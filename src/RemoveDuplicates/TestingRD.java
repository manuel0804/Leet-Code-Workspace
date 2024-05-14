package RemoveDuplicates;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestingRD {
    @Test
    public void test1(){
        int[] input = {1,2,2,1,4,4,5,5,3};
        int expected = 5;
        int actual = MainRD.removeDuplicates(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        int[] input = {1,2,2,1,4,4,5,5,3,3,3,3,3,3,3,3,3,3,3};
        int expected = 5;
        int actual = MainRD.removeDuplicates(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        int[] input = {3,3,3,3,3,3,3,3,3,3,3,3};
        int expected = 1;
        int actual = MainRD.removeDuplicates(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        int[] input = {1,2,3,4,5,6,7,8,9};
        int expected = 9;
        int actual = MainRD.removeDuplicates(input);
        assertEquals(expected, actual);
    }
}
