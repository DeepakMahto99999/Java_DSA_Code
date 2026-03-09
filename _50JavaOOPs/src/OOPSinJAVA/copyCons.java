package OOPSinJAVA;

class ComplexNumber {
    private double real, imaginary;
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber(ComplexNumber c) {
        System.out.println("Copy constructor has been called");
        real = c.real;
        imaginary = c.imaginary;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}
public class copyCons {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(45, 91);
        ComplexNumber c2 = new ComplexNumber(c1);
        System.out.println(c2);
    }
}
