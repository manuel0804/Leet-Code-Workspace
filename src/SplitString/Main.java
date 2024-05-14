package SplitString;

/**
 * SplitString
 * Given a string, you need to reverse the order of characters in each word within a
 * sentence while still preserving whitespace and initial word order.
 */

public class Main {
    public static void main(String[] args) {
        String str = "Hello World my Name is John Doe";
        String[] arrOfStr = str.split(" ");
        String[] arrOfStr2 = str.split("");
        System.out.println("Normal: ");
        for(String a : arrOfStr2) {
            System.out.print(a);
        }

        for(int i = 0; i < arrOfStr2.length / 2; i++) {
            String temp = arrOfStr2[i];
            arrOfStr2[i] = arrOfStr2[arrOfStr2.length - i - 1];
            arrOfStr2[arrOfStr2.length - i - 1] = temp;
        }

        System.out.println(" \nReversed: ");
        for(String a : arrOfStr2) {
            System.out.print(a);
        }
    }
}
