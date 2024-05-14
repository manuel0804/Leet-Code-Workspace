package ListAddition;
import java.util.*;

/**
 * Add two numbers represented by two lists
 */

public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(7, 4));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1 ,9, 3, 6));

        List<Integer> result = addTwoNumbers(l1, l2);
        System.out.print("Ergebnis: ");
        for(Integer i : result){
            System.out.print(i);
        }
    }

    private static List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>();
        int carry = 0;
        if (l1.size() == l2.size()) {
            for (int i = l1.size()-1; i>=0; i--){
                int sum = l1.get(i) + l2.get(i) + carry;
                if(sum > 9){
                    carry = 1;
                    sum = sum - 10;
                } else {
                    carry = 0;
                }
                result.add(sum);
            }
            if(carry == 1){
                result.add(1);
            }
        } else if (l1.size() > l2.size()) {
            int helper = l2.size()-1;
            for(int i = l1.size()-1; i >= 0; i--){
                if(helper >= 0){
                    int sum = l1.get(i) + l2.get(helper) + carry;
                    if(sum > 9){
                        carry = 1;
                        sum = sum - 10;
                    } else {
                        carry = 0;
                    }
                    result.add(sum);
                    helper--;
                } else {
                    int sum = l1.get(i) + carry;
                    if(sum > 9){
                        carry = 1;
                        sum = sum - 10;
                    } else {
                        carry = 0;
                    }
                    result.add(sum);
                }
            }
            if (carry == 1){
                result.add(1);
            }
        }else{
            int helper2 = l1.size()-1;
            for(int i = l2.size()-1; i >= 0; i--){
                if(helper2 >= 0){
                    int sum = l2.get(i) + l1.get(helper2) + carry;
                    if(sum > 9){
                        carry = 1;
                        sum = sum - 10;
                    } else {
                        carry = 0;
                    }
                    result.add(sum);
                    helper2--;
                } else {
                    int sum = l2.get(i) + carry;
                    if(sum > 9){
                        carry = 1;
                        sum = sum - 10;
                    } else {
                        carry = 0;
                    }
                    result.add(sum);
                }
            }
            if (carry == 1){
                result.add(1);
            }
        }
        return reverse(result);
    }

    private static List<Integer> reverse(List<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = list.size()-1; i >= 0; i--){
            result.add(list.get(i));
        }
        return result;
    }
}

