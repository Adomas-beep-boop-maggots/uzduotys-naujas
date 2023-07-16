package ade;

public class MyMatrix {
    private int rows;
    private int cols;
    private float[][] matrix;

    public MyMatrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new float[rows][cols];
    }

    public void printAsInts() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append((int) matrix[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public void identityRotated() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == (cols - j - 1)) {
                    matrix[i][j] = 1.0f;
                } else {
                    matrix[i][j] = 0.0f;
                }
            }
        }
    }
}
