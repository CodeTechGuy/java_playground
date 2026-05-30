package Strings;

public class palindrome_count {

    public static void main(String[] args) {
        String str = "abcdcba";
        int n = str.length();
        int count = 0;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1; j<=n ;j++){
                boolean ans = palindrome(str.substring(i,j));
                if(ans == true){
                    count++;
                }
            }
        }
        System.out.println("Number of palindrome substring is "+count);
    }
    public static boolean palindrome(String str){

        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
