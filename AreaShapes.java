class AreaShapes {

    double area(double radius) {
        return Math.PI * radius * radius;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(float base, float height) {
        return 0.5 * base * height;
    }

    int area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        AreaShapes obj = new AreaShapes();
        System.out.println("Area of Circle: " + obj.area(7.0));
        System.out.println("Area of Rectangle: " + obj.area(10.0, 5.0));
        System.out.println("Area of Triangle: " + obj.area(6f, 4f));
        System.out.println("Area of Square: " + obj.area(5));
    }
}
