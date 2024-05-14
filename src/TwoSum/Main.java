package TwoSum;

import java.util.ArrayList;
import java.util.Collections;

/**
 * TwoSum
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 */

public class Main {
    public static void main(String[] args) {
        int[] nums = {22, 7, 11, -1, 19, 2, 3, 5, 6, 11, 9, 10, 12, 13, 14, 15};
        int target = 33;
        int[] result = getDigits(nums, target);
        for(Integer i : result){
            System.out.print("Index: " + i + ", Zahl: " + nums[i] + "\n");
        }
    }

    private static int[] getDigits(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
