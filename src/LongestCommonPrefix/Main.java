package LongestCommonPrefix;

/**
 * find the longest common prefix string amongst an array of strings
 */

public class Main {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "float"};
        System.out.println(longestCommonPrefix(words));
    }
    public static String longestCommonPrefix(String[] words) {
        if (words.length == 0) return "";
        String prefix = words[0];

        for (int i = 1; i < words.length; i++) {
            while (words[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
