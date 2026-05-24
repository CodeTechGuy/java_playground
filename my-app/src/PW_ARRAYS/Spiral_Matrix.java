package PW_ARRAYS;

public class Spiral_Matrix {

    public static void main(String[] args) {
        int [][]arr1 = {
                {11,12,13,14},
                {15,16,17,18},
                {19,20,21,22},
                {23,24,25,26}
        };

        int totalEle = 0;
        int r = 4;
        int c = 4;
        int tR = 0, bR = r-1 , lC = 0, rC = c-1;


        while( totalEle < r*c){
            for(int j=lC; j<=rC && totalEle < r*c; j++){
                System.out.print(arr1[tR][j]+" ");
                totalEle++;
            }
            tR++;

            for(int i=tR;i<=bR && totalEle < r*c;i++){
                System.out.print(arr1[i][rC]+" ");
                totalEle++;
            }
            rC--;

            for(int j=rC;j>=lC && totalEle < r*c;j--){
                System.out.print(arr1[bR][j]+" ");
                totalEle++;
            }
            bR--;

            for(int i=bR; i>=tR && totalEle < r*c;i--){
                System.out.print(arr1[i][lC]+" ");
                totalEle++;
            }
            lC++;
        }


    }
}
