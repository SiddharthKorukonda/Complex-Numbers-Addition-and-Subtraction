/* Siddharth Korukonda
   115607752
   CSE 114
   Paul Fodor
   Homework 6
   Question 2 (Complex.java)
 */

import java.util.*;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex() {
        this(0,0);
    }

    public double get_realPart() {
        return realPart;
    }

    public double get_imaginaryPart() {
        return imaginaryPart;
    }

    public static Complex add(Complex c1, Complex c2) {
        double new_realPart = c1.realPart + c2.realPart;
        double new_imaginaryPart = c1.imaginaryPart + c2.imaginaryPart;
        return new Complex(new_realPart,new_imaginaryPart);
    }

    public static Complex subtract(Complex c1, Complex c2) {
        double new_realPart = c1.realPart-c2.realPart;
        double new_imaginaryPart = c1.imaginaryPart-c2.imaginaryPart;
        return new Complex(new_realPart,new_imaginaryPart);
    }

    public void formatComplex() {
        System.out.println("("+realPart+","+imaginaryPart+")");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter real part of the first complex number: ");
        double realPart_first = s.nextDouble();
        System.out.print("Enter imaginary part of the first complex number: ");
        double imaginaryPart_first = s.nextDouble();
        System.out.print("Enter real part of the second complex number: ");
        double realPart_second = s.nextDouble();
        System.out.print("Enter imaginary part of the second complex number: ");
        double imaginaryPart_second = s.nextDouble();

        Complex c1 = new Complex(realPart_first,imaginaryPart_first);
        Complex c2 = new Complex(realPart_second,imaginaryPart_second);

        System.out.print("\nThe first complex number is: ");
        c1.formatComplex();

        System.out.print("The second complex number is: ");
        c2.formatComplex();

        Complex sum = Complex.add(c1,c2);
        System.out.print("Addition of the complex numbers is: ");
        sum.formatComplex();

        Complex difference = Complex.subtract(c1,c2);
        System.out.print("Subtraction of the complex numbers is: ");
        difference.formatComplex();
    }
}
