package KeyboradRow;

/**
 * find the words that can be typed using letters of alphabet on only one row's of American keyboard
 */

public class Main {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace", "alle", "adjdas"};
        String[] result = findWords(words);
        for(String a : result) {
            System.out.println(a);
        }
    }

    private static String[] findWords(String[] words) {
        String[] keyboard = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        String[] result = new String[words.length];


        int index = 0;
        for(String word : words) {
            String temp = word.toLowerCase();

            int row = 0;
            if(keyboard[0].contains(temp.substring(0, 1))) {
                row = 0;
            } else if(keyboard[1].contains(temp.substring(0, 1))) {
                row = 1;
            } else if(keyboard[2].contains(temp.substring(0, 1))) {
                row = 2;
            }


            boolean check = true;
            for(int i = 1; i < temp.length(); i++) {
                if(!keyboard[row].contains(temp.substring(i, i + 1))) {
                    check = false;
                    break;
                }
            }

            if(check) {
                result[index] = word;
                index++;
            }
        }

        int anzahl = 0;
        for(int i = 0; i < result.length; i++) {
            if(result[i] != null) {
                anzahl ++;
            }
        }

        String[] resultNew = new String[anzahl];
        for(int i = 0; i < resultNew.length; i++) {
            if(result[i] != null) {
                resultNew[i] = result[i];
            }
        }
        return resultNew;
    }
}
