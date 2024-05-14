package SingleNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 */

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 1, 4, 4, 5, 5, 3};
        System.out.println(findSingleNumber(numbers));
    }

    public static int findSingleNumber(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        for (int number : numbers) {
            if (list.contains(number)) {
                list.remove(Integer.valueOf(number));
            } else {
                list.add(number);
            }
        }

        if(list.size() == 0){
            return 0;
        }else{
            return list.get(0);
        }
    }
}