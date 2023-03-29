package complex;

import java.util.Scanner;
public class TestComplex {
    public static void main(String[] args) {
        System.out.println("Enter first Complex Number:");
        Scanner sc=new Scanner (System.in);
        Complex c1 = new Complex(sc.nextDouble(), sc.nextDouble());
        System.out.println("Enter second Complex Number:");
        Complex c2 = new Complex(sc.nextDouble(), sc.nextDouble());
        
        Complex c3 = c1.add(c2);
        
        Complex c4 = c1.subtract(c2);
        
        System.out.println("First of Complex Number:");
        c1.print();
        System.out.println("Second of Complex Number:");
        c2.print();
        System.out.println("Sum of Complex Number:");
        c3.print();
        System.out.println("Product Complex Number:");
        c4.print();
    }
}
