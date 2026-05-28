package Strings;

public class charCount {


        public static void main(String[] args) {
            String str = "aaabaabbvkbbcccdddde";
            StringBuilder sb = new StringBuilder(str);
            StringBuilder ans = new StringBuilder("");
            int n = str.length();
            int count = 1;
            for(int i=0;i<n;i++){
                char ch = sb.charAt(i);
                ans.append(ch);

                while(i<n-1 && ch==sb.charAt(i+1))  {
                    count++;
                    i++;

                }

                if(count>1) ans.append(count);
                count =1;

            }
            System.out.println(ans);
        }



}
