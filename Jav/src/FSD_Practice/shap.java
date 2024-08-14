package FSD_Practice;
class Shape {
    double getArea() {
        return 0;
    }
}

class Rect extends Shape {
    double length;
    double width;

    Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

public class shap {
    public static void main(String[] args) {
        Rect rectangle = new Rect(5, 4);
        System.out.println("Area of Rectangle: " + rectangle.getArea());  // Outputs: Area of Rectangle: 20.0
    }
}

