package complex;

public class Complex {
    private double realPart;
    private double imaginaryPart;
    
    public Complex() {
        this.realPart = 0.0;
        this.imaginaryPart = 0.0;
    }
    
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    
    public Complex add(Complex other) {
        double real = this.realPart + other.realPart;
        double imaginary = this.imaginaryPart + other.imaginaryPart;
        return new Complex(real, imaginary);
    }
    
    public Complex subtract(Complex other) {
        double real = this.realPart - other.realPart;
        double imaginary = this.imaginaryPart - other.imaginaryPart;
        return new Complex(real, imaginary);
    }
    
    public void print() {
        System.out.println( this.realPart+ " + "+this.imaginaryPart+" i");
    }
}
