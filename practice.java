abstract class Shape {
    abstract void area();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 3);
        Shape circ = new Circle(4);

        rect.area();
        circ.area();
    }
}
