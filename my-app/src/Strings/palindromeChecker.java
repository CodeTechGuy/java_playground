package Strings;

public class palindromeChecker {
    public static void main(String[] args) {
        System.out.println(palindrome("svh"));
        System.out.println(palindrome("abcba"));
        System.out.println(palindrome("svmmvs"));

    }

    public static boolean palindrome(String str){
//        String str = "svh";
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
