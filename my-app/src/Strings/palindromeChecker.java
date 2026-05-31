package Strings;

public class palindromeChecker {
    public static void main(String[] args) {
        System.out.println(palindrome("svh"));
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
