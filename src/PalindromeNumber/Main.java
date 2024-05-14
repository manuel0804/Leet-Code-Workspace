package PalindromeNumber;

/**
 * Determine whether an integer is a palindrome.
 * An integer is a palindrome when it reads the same backward as forward.
 */

public class Main {
    public static void main(String[] args) {
        int x = 10000;
        boolean result = isPalindrome(x);
        System.out.println("Palindrome: " + result);
    }

    private static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        String number = String.valueOf(x);
        System.out.println("Number: " + number);

        String reverse = "";
        for(int i = number.length()-1; i >= 0; i--){
            reverse = reverse + number.charAt(i);
        }
        System.out.println("Reverse: " + reverse);
        return number.equals(reverse);
    }
}
