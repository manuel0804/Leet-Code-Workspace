package RemoveDuplicates;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 */

public class MainRD {
    public static void main(String[] args) {
        int[] input = {1,2,2,1,4,4,5,5,5,5,3,3};
        int expected = 5;
        int actual = removeDuplicates(input);
        System.out.println("Expected: " + expected + "\nActual: " + actual);

    }

    public static int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        if(list.toArray().length == 0){
            return 0;
        }else{
            return list.toArray().length;
        }

    }

}
