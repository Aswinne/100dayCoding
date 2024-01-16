public class day097 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Array dua dimensi:");
        displayMatrix(matrix);

        int value = matrix[1][2];
        System.out.println("\nNilai pada baris 2, kolom 3: " + value);
        matrix[0][1] = 10; 
        System.out.println("\nArray dua dimensi setelah diubah:");
        displayMatrix(matrix);
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}