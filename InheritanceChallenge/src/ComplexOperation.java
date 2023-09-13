public class ComplexOperation {
    private double real;
    private double imaginary;

    public static void main(String[] args) {
        ComplexOperation one = new ComplexOperation(1.0, 1.0);
        ComplexOperation number = new ComplexOperation(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }

    public ComplexOperation(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    public double add(double r, double i) {
        double newReal = (getReal() + r);
        double newImaginary = (getImaginary()+i);
        return newReal + newImaginary ;
    }
    public double add(ComplexOperation another) {
        return (another.real+real) + ( another.imaginary+imaginary);
    }
    public double subtract(double real, double imaginary) {
        return (real - imaginary) ;
    }
    public double subtract(ComplexOperation another) {
        return (another.real-real) - ( another.imaginary-imaginary);
    }
}
