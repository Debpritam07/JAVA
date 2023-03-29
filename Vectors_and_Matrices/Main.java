package Vectors_and_Matrices;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Ask the user to create a vector
            System.out.print("Enter the size of the vector: ");
            int size = scanner.nextInt();

            double[] vectorData = new double[size];

            System.out.println("Enter the values for the vector:");
            for (int i = 0; i < size; i++) {
                vectorData[i] = scanner.nextDouble();
            }

            Vector vectorA = new Vector(vectorData);
            System.out.println("Vector A: ");
            vectorA.display();

            // Ask the user to create another vector
            System.out.print("Enter the size of another vector: ");
            size = scanner.nextInt();

            vectorData = new double[size];

            System.out.println("Enter the values for the vector:");
            for (int i = 0; i < size; i++) {
                vectorData[i] = scanner.nextDouble();
            }

            Vector vectorB = new Vector(vectorData);
            System.out.println("Vector B: ");
            vectorB.display();

            // Add the two vectors
            try {
                System.out.println("Vector Sum: ");
                Vector vectorSum = (Vector) vectorA.add(vectorA, vectorB);
                vectorSum.display();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Multiply the two vectors
            try {
                double dotProduct = (double) vectorA.multiply(vectorA, vectorB);
                System.out.println("Dot product: " + dotProduct);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Ask the user to create a matrix
            System.out.print("Enter the number of rows of the matrix: ");
            int rows = scanner.nextInt();

            System.out.print("Enter the number of columns of the matrix: ");
            int cols = scanner.nextInt();

            double[][] matrixData = new double[rows][cols];

            System.out.println("Enter the values for the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrixData[i][j] = scanner.nextDouble();
                }
            }

            Matrix matrixA = new Matrix(matrixData);
            System.out.println("Matrix A: ");
            matrixA.display();

            // Ask the user to create another matrix
            System.out.print("Enter the number of rows of another matrix: ");
            int rows2 = scanner.nextInt();

            System.out.print("Enter the number of columns of another matrix: ");
            int cols2 = scanner.nextInt();

            matrixData = new double[rows2][cols2];

            System.out.println("Enter the values for the matrix:");
            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < cols2; j++) {
                    matrixData[i][j] = scanner.nextDouble();
                }
            }

            Matrix matrixB = new Matrix(matrixData);
            System.out.println("Matrix A: ");
            matrixB.display();

            // Add the two matrices
            try {
                Matrix matrixSum = (Matrix) matrixA.add(matrixA, matrixB);
                System.out.println("Matix Sum: ");
                matrixSum.display();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Multiply the two matrices
            try {
                Matrix matrixProduct = (Matrix) matrixA.multiply(matrixA, matrixB);
                System.out.println("Matrix Product: ");
                matrixProduct.display();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
