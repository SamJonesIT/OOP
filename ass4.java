import java.util.Scanner;

abstract class Shape {
    //variables
    double dimension1, dimension2;
    //constructor
    public void inputData(double d1, double d2) {
        this.dimension1 = d1;
        this.dimension2 = d2;
    }
    //abstract method
    abstract double computeArea();
}

class Triangle extends Shape {
    @Override
    double computeArea() {
        return 0.5 * dimension1 * dimension2;
    }
}

class Rectangle extends Shape {
    @Override
    double computeArea() {
        return dimension1 * dimension2;
    }
}

class Main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Shape shape;
        System.out.println("Enter 1 for triangle or 2 for rectangle");
        int choice = sc.nextInt();

        if(choice==1) {
            shape = new Triangle();
            System.out.println("Enter base and height of the triangle");
        } else if(choice==2) {        
            shape = new Rectangle();
            System.out.println("Enter length and breadth of the rectangle");
        } else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        shape.inputData(d1, d2);
        System.out.println("The area is: " + shape.computeArea());

        sc.close();
    }
}