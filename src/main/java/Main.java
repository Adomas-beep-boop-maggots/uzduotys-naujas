import ade.MyMatrix;

public class Main {
    public static void main(String[] args) {

        MyMatrix matrix = new MyMatrix(4);

        matrix.identityRotated();

        matrix.printAsInts();
    }
}