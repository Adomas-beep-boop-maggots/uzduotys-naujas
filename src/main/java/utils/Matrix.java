package utils;

public class Matrix {
    private int size;
    private int[][] matrix;

    public Matrix(int size) {
        this.size = size;
        this.matrix = new int[size][size];
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sb.append(matrix[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public Matrix identityRotated() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == (size - j - 1)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return this;
    }
}