import java.util.Scanner;

class Circle {
    void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle = " + (Math.PI * r * r));
    }
}

class Rectangle {
    void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle = " + (l * b));
    }
}

class Square {
    void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        double s = sc.nextDouble();
        System.out.println("Area of Square = " + (s * s));
    }
}

class Triangle {
    void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and height: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Area of Triangle = " + (0.5 * b * h));
    }
}

public class GraphicsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        Circle obj1 = new Circle();
        Rectangle obj2 = new Rectangle();
        Square obj3 = new Square();
        Triangle obj4 = new Triangle();

        while (true) {
            System.out.println("\n1) Circle\n2) Rectangle\n3) Square\n4) Triangle\n5) Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj1.area();
                    break;
                case 2:
                    obj2.area();
                    break;
                case 3:
                    obj3.area();
                    break;
                case 4:
                    obj4.area();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}