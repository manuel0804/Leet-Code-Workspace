package SearchInsertPosition;

/**
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 */

public class Main {
    public static void main(String[] args) {
        int nums[] = {2,4,6,8};
        int target = 9;
        int result = getIndex(nums, target);
        System.out.println(result);
    }

    public static int getIndex(int[] nums, int target){
        int result = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target || nums[i] > target){
                result = i;
                break;
            }else if(target > nums[nums.length-1]){
                result = nums.length;
                break;
            }
        }
        return result;
    }
}
