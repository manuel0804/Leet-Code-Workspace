package PlusOne;

/**
 * PlusOne
 * Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {8,9,9,9,9};
        int[] result = plusOne(digits);

        print(result);

        }
    protected static int[] plusOne(int[] digits){
            int len = digits.length;

            if (digits[len - 1] != 9) {
                digits[len - 1]++;
            }
            else {
                digits[len - 1] = digits[len - 1] + 1;
                for (int i = len - 1; i >= 0; i--) {
                    if(digits[0] == 10){
                        int[] result = new int[len + 1];
                        result[0] = 1;
                        return result;
                    }
                    if (digits[i]  ==  10) {
                        digits[i] = 0;
                        digits[i - 1] = digits[i - 1] + 1;
                    }
                }
            }
            return digits;
    }
    private static void print(int[] result) {
        for (int res : result) {
            System.out.print(res);
        }
    }
        }



