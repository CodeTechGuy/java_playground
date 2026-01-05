import java.util.Scanner;
public class nested_loops {
    public static void main(String[] args){
//        rectPattern();
//        rect2Pattern();
//        rev();
//        rect2MPattern();
//        triPattern();
//        tri2Pattern();
//        piramid();
//        rectNum();
//        oneTwoOneTwo();
//        numTri();
//        numPyramid();
        hollowNumber();
    }

    public static void rectPattern(){
        for(int i=1;i<=3;i++){
            for(int j=1; j<=6 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rect2Pattern() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the cols: ");
        int c = sc.nextInt();

        for(int i=0;i<=r;i++){
            if(i==0 || i==4){
                for(int j=1 ; j<=c ;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int k=1;k<=c;k++){

                    if(k==1 || k==6){
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

    public static void rev(){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.println("row "+i+" col "+j);
            }
            System.out.println();
        }
    }

    public static void rect2MPattern() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the cols: ");
        int c = sc.nextInt();

        for(int i=0;i<=r;i++){

                for(int j=1 ; j<=c ;j++) {
                    if (i == 0 || i == 4 || j == 1 || j == 6) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
        }
    }


    public static void triPattern() {
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void tri2Pattern() {
        for(int i=5;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void piramid() {
        for(int i=1;i<=5;i++){

//            if(i%2==0){
//                continue;
//            }else{
                for(int j=1;j<=5-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=2*i-1;k++){
                    System.out.print("*");
                }
//            }


            System.out.println();
        }
    }


    public static void rectNum() {
        for(int i=0;i<=6;i++){
            for(int j=1+i;j<=7;j++){
                System.out.print(j);
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void oneTwoOneTwo() {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("2");
                }
            }
            System.out.println();
        }
    }


    public static void numTri() {
        for(int i=0;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void numPyramid() {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void hollowNumber() {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                if(i==1 || i==4 || j==1 || j==2*i-1){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


