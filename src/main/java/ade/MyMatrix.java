package ade;

public class MyMatrix {
    private int size;
    private float[][] matrix;

    public MyMatrix(int size) {
        this.size = size;
        this.matrix = new float[size][size];
    }

    public void printAsInts() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sb.append((int) matrix[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public MyMatrix identityRotated() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == (size - j - 1)) {
                    matrix[i][j] = 1.0f;
                } else {
                    matrix[i][j] = 0.0f;
                }
            }
        }
        return this;
    }
}