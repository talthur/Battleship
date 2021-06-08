import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] matrix = new String[n][n];

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (j == i || i == n / 2 || j == n / 2 || j + 1 == n - i) {
                    matrix[i][j] = "*";
                } else {
                    matrix[i][j] = ".";
                }

            }
        }

        for (String[] x : matrix){
            for (String y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}