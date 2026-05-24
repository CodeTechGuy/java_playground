package PW_ARRAYS;
import java.util.Arrays;

public class transpose {
    public static void main(String[] args) {

            int [][] arr1 = {
                    {1,2,3},
                    {3,1,2},
                    {5,9,8}
            };

            int n = arr1.length;
            int m = arr1[0].length;

            int [][] ans = new int[3][3];

            for(int i=0; i<n;i++){
                for(int j=0;j<m ; j++){
                    ans[j][i] = arr1[i][j];
                }
            }



            System.out.println(Arrays.deepToString(arr1));
            System.out.println(Arrays.deepToString(ans));
    }

    static void transposeInPlace(int [][] matrix , int r , int c){
        int[][] ans = new int[r][c];

        for(int i=0;i<r ;i++){
            for(int j=0 ; j<c ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = ans[j][i];
                ans[j][i] = temp;
            }
        }
    }

}
