public class Main {
    interface Shape {
        double area();

    }

    static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;

        }

        public double area() {
            return Math.PI * radius * radius;

        }

    }

    static class Triangle implements Shape {
        private double base;
        private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;

        }

        public double area() {
            return 0.5 * base * height;

        }

    }

    static class Square implements Shape {
        private double side;

        public Square(double side) {
            this.side = side;

        }

        public double area() {
            return side * side;

        }

    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Triangle(4, 3),
                new Square(2)

        };

        double totalArea = calculateTotalArea(shapes);
        System.out.println("Сумарна площа всіх фігур: " + totalArea);

    }

    public static double calculateTotalArea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.area();

        }

        return total;

    }

}