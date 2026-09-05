interface Shape {
    void calculateArea();
}


class Rectangle implements Shape {
    int length, width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    public void calculateArea() {
        int area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }
}


class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}


class Triangle implements Shape {
    int base, height;

    Triangle(int b, int h) {
        base = b;
        height = h;
    }

    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);
    }
}


public class InterfaceShapeDemo {
    public static void main(String[] args) {

        Shape r = new Rectangle(10, 5);
        Shape c = new Circle(7);
        Shape t = new Triangle(6, 4);

        r.calculateArea();
        c.calculateArea();
        t.calculateArea();
    }
}
