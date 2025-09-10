public class Main {

    static class Shape {
        public double area() {
            return 0.0;
        }
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double area() {
            return length * width;
        }
    }

    public static void main(String[] args) {
        Shape s1 = new Circle(5.0);
        System.out.println("Area of Circle: " + s1.area());

        Shape s2 = new Rectangle(4.0, 6.0);
        System.out.println("Area of Rectangle: " + s2.area());
    }
}
