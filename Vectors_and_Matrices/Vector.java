package Vectors_and_Matrices;

class Vector implements MathOperations {
    private int size;
    private double[] data;

    public Vector(double[] data) {
        this.size = data.length;
        this.data = data;
    }

    public Object add(Object a, Object b) {
        Vector vectorA = (Vector) a;
        Vector vectorB = (Vector) b;

        if (vectorA.size != vectorB.size) {
            throw new IllegalArgumentException("Vectors must have the same dimensions to add them.");
        }

        double[] resultData = new double[vectorA.size];

        for (int i = 0; i < vectorA.size; i++) {
            resultData[i] = vectorA.data[i] + vectorB.data[i];
        }

        return new Vector(resultData);
    }

    public Object multiply(Object a, Object b) {
        Vector vectorA = (Vector) a;
        Vector vectorB = (Vector) b;

        if (vectorA.size != vectorB.size) {
            throw new IllegalArgumentException("Vectors must have the same dimensions to multiply them.");
        }

        double sum = 0;
        for (int i = 0; i < vectorA.size; i++) {
            sum += vectorA.data[i] * vectorB.data[i];
        }

        return sum;
    }

    public void display() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.data[i] + " ");
        }
        System.out.println();
    }
}