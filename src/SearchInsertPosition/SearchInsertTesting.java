package SearchInsertPosition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInsertTesting {
    @Test
    public void test1(){
        int nums[] = {2,4,6,8};
        int target = 9;
        int result = Main.getIndex(nums, target);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void test2(){
        int nums[] = {2,4,6,8};
        int target = 7;
        int result = Main.getIndex(nums, target);
        Assertions.assertEquals(3, result);
    }
    @Test
    public void test3(){
        int nums[] = {2,4,6,8};
        int target = 1;
        int result = Main.getIndex(nums, target);
        Assertions.assertEquals(0, result);
    }
}
