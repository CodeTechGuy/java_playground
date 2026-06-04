package PW_ARRAYS;

import java.util.Scanner;

public class lastOccurrenceIdx {
    public static void main(String[] args) {
       sortedCheck(new int[]{5, 6, 5, 3, 5, 4, 6, 5});
       sortedCheck(new int[]{5, 6, 7,8,8,9,8});

       int [] arr = {4,3,6,2,7,8};
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;

       int mn , mx ;

       for(int i=0;i<arr.length;i++){
           if(arr[i]>max) max = arr[i];
//           if(arr[i]<max) min = arr[i];

       }
       for(int i=0;i<arr.length;i++){
//           if(arr[i]>min) max = arr[i];
           if(arr[i]<min) min = arr[i];

       }

       System.out.println("the max value is "+max+" and min value is "+min);
    }

    public static void lastOccurenceIdx(int [] arr){
//        int [] arr = {5,6,5,3,5,4,6,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        int lastIdx = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                lastIdx = i;
            }
        }
        System.out.println(String.format("the last occurrence of element %d is on %d'th index" , num , lastIdx ));
    }

    public static void sortedCheck(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) {
                System.out.println("This not a sorted array");
                return;
            }
        }
        System.out.println("This is a sorted array");
    }
}
