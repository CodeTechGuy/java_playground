import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int [][] arr1 = {
                {1,2,1},
                {3,1,2}
        };

        int n = arr1.length;

        int r1 = 2;
        int c1 = 3;
        int r2 = 3;
        int c2 = 2;


        int [][] arr2 = {
                {2,1},
                {1,3},
                {1,1}
        };


        int [][] mul = new int[r1][c2];

        for(int i=0; i<r1 ; i++){
            for(int j = 0; j<c2 ; j++){
                for(int k=0 ; k<c1 ; k++){
                    mul[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(mul));
    }
}
