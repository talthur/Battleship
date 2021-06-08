class ArrayOperations {
    public static int[][][] createCube() {

        int[][][] matrix = new int[3][3][3];
        int counter = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                for (int y = 0; y < 3; y++){
                    matrix[i][j][y] = counter;
                    counter ++;
                }
            }
            counter = 0;
        }
        return matrix;
    }
}