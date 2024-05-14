package RomanToInteger;

/**
 * Given a roman numeral, convert it to an integer.
 */

public class Main {
    public static void main(String[] args) {
        String s = "XI";
        int result = romanToInt(s);
        System.out.println("Result: " + result);
    }

    private static int romanToInt(String s) {
        int result = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'I'){
                if(i+1 < s.length() && s.charAt(i+1) == 'V'){
                    result = result + 4;
                    i++;
                } else if(i+1 < s.length() && s.charAt(i+1) == 'X'){
                    result = result + 9;
                    i++;
                } else {
                    result = result + 1;
                }
            } else if(s.charAt(i) == 'V'){
                result = result + 5;
            } else if(s.charAt(i) == 'X'){
                if(i+1 < s.length() && s.charAt(i+1) == 'L'){
                    result = result + 40;
                    i++;
                } else if(i+1 < s.length() && s.charAt(i+1) == 'C'){
                    result = result + 90;
                    i++;
                } else {
                    result = result + 10;
                }
            } else if(s.charAt(i) == 'L'){
                result = result + 50;
            } else if(s.charAt(i) == 'C'){
                if(i+1 < s.length() && s.charAt(i+1) == 'D'){
                    result = result + 400;
                    i++;
                } else if(i+1 < s.length() && s.charAt(i+1) == 'M'){
                    result = result + 900;
                    i++;
                } else {
                    result = result + 100;
                }
            } else if(s.charAt(i) == 'D'){
                result = result + 500;
            } else if(s.charAt(i) == 'M'){
                result = result + 1000;
            }
        }
        return result;
    }
}
