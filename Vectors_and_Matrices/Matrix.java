package Vectors_and_Matrices;

public class Matrix implements MathOperations {
    private int rows;
    private int cols;
    private double[][] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    public Matrix(double[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = data;
    }

    public Object add(Object a, Object b) {
        Matrix matrixA = (Matrix) a;
        Matrix matrixB = (Matrix) b;

        if (matrixA.rows != matrixB.rows || matrixA.cols != matrixB.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions to add them.");
        }

        double[][] resultData = new double[matrixA.rows][matrixA.cols];

        for (int i = 0; i < matrixA.rows; i++) {
            for (int j = 0; j < matrixA.cols; j++) {
                resultData[i][j] = matrixA.data[i][j] + matrixB.data[i][j];
            }
        }

        return new Matrix(resultData);
    }

    public Object multiply(Object a, Object b) {
        Matrix matrixA = (Matrix) a;
        Matrix matrixB = (Matrix) b;

        if (matrixA.cols != matrixB.rows) {
            throw new IllegalArgumentException("Matrix A's number of columns must match Matrix B's number of rows to multiply them.");
        }

        double[][] resultData = new double[matrixA.rows][matrixB.cols];

        for (int i = 0; i < matrixA.rows; i++) {
            for (int j = 0; j < matrixB.cols; j++) {
                double sum = 0;
                for (int k = 0; k < matrixA.cols; k++) {
                    sum += matrixA.data[i][k] * matrixB.data[k][j];
                }
                resultData[i][j] = sum;
            }
        }

        return new Matrix(resultData);
    }

    public void display() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(this.data[i][j] + " ");
            }
            System.out.println();
        }
    }
}