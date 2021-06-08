import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];


        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = Math.abs(j - i);
            }
        }

        for (int[] x : matrix) {
            for (int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}