package Strings;

public class String_substring {
    public static void main(String[] args) {
        String str = "abcd";
        int n = str.length();
        for(int i=0 ; i<n ; i++){
            for(int j=i+1; j<=n ;j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
