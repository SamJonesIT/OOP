import java.util.Scanner;

class Complex {

    double 
        real, imaginary,
        real_sum, imaginary_sum,
        real_diff, imaginary_diff,
        real_mul, imaginary_mul,
        denominator, real_div, imaginary_div;

    Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    Complex(double real, double imaginary) {
        this.real = real; 
        this.imaginary = imaginary;
    }

    void add(Complex this, Complex other) {
        real_sum = this.real + other.real;
        imaginary_sum = this.imaginary + other.imaginary;
        if(imaginary_sum >= 0)
            System.out.println("Sum : " + real_sum + "+" + imaginary_sum + "i");
        else
            System.out.println("Sum : " + real_sum + "-" + (-imaginary_sum) + "i");
    }

    void diff(Complex this, Complex other) {
        real_diff = this.real - other.real;
        imaginary_diff = this.imaginary - other.imaginary;
        if(imaginary_diff >= 0)
            System.out.println("Difference : " + real_diff + "+" + imaginary_diff + "i");
        else
            System.out.println("Difference : " + real_diff + "-" + (-imaginary_diff) + "i");
    }

    void mul(Complex this, Complex other) {

        real_mul = (this.real * other.real) - (this.imaginary * other.imaginary);
        imaginary_mul = (this.real * other.imaginary) + (this.imaginary * other.real);
        if(imaginary_mul >= 0)
            System.out.println("Multiplication : " + real_mul + "+" + imaginary_mul + "i");
        else
            System.out.println("Multiplication : " + real_mul + "-" + (-imaginary_mul) + "i");
    }

    void div(Complex this, Complex other) {
        denominator = other.real * other.real + other.imaginary * other.imaginary;
        real_div = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        imaginary_div = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        if(imaginary_div >= 0)
            System.out.println("Division : " + real_div + "+" + imaginary_div + "i");
        else
            System.out.println("Division : " + real_div + "-" + (-imaginary_div) + "i");
    }

}

class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the real part of first complex number");
        double real1 = sc.nextDouble();
        System.out.println("Enter the imaginary part of first complex number");
        double imaginary1 = sc.nextDouble();

        System.out.println("Enter the real part of second complex number");
        double real2 = sc.nextDouble();
        System.out.println("Enter the imaginary part of second complex number");
        double imaginary2 = sc.nextDouble();

        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);

        c1.add(c2);
        c1.diff(c2);
        c1.mul(c2);
        c1.div(c2);

        sc.close();
    }
}