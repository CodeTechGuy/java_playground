//import java.util.*;
import java.util.Scanner;

public class single_loops {
//    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
//        countNum();
//        sumNum();
//        revNum();
//        oddEvenSum();
//        factorial();
        powerRaise();
    }

    public static void countNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count = 0 ;

        while (num > 0) {
            num = num/10;
            count++;
        }
        System.out.println(count);
    }

    public static void sumNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;

        while(num>0){
            sum += num%10;
            num = num/10;
        }
        System.out.println(sum);
    }

    public static void revNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num to reverse: ");
        int num = sc.nextInt();
        int rev = 0;

        while(num>0){
            int ld = num%10;
            num = num/10;
            rev = rev*10 + ld ;
        }
        System.out.println(rev);
    }

    public static void oddEvenSum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i=0;i<=n;i++){
            if(i%2==0){
                sum = sum-i;
            }
            else {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }


    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for factorial: ");
        int n = sc.nextInt();
        int fac = 1;
        if(n==0 || n==1){
            System.out.println("1");
        }
        else {
            for(int i=n ; i>=1 ; i-- ){
                fac *=  i ;
            }
            System.out.println(fac);
        }
    }

    public static void powerRaise(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        int c = (int)Math.pow(a,b);
        System.out.println(c);
    }

    public static void pyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void hollowPyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i*2-1;j++){
                if(i==n || j==1 || j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}