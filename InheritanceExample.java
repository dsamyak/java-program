abstract class Shape {
    abstract void area();
}
class Triangle extends Shape {
    double side1, side2;

    Triangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    void area() {
        double area = 0.5 * side1 * side2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Rect extends Shape {
    double length, breadth;

    Rect(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Triangle t = new Triangle(5, 10);
        Rect r = new Rect(4, 6);

        t.area();  
        r.area(); 
    }
}
