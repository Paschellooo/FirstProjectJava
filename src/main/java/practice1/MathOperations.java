package practice1;

public class MathOperations {
    public static void main(String[] args) {
        int sum1 = sum(10, 12);
        System.out.println(sum1);

        int subtract1 = subtract(5, 4);
        System.out.println(subtract1);

        int multiply1 = multiply(10, 5);
        System.out.println(multiply1);

        double divide1 = divide(10, 5);
        System.out.println(divide1);

        int findMax1 = findMax(10, 5);
        System.out.println(findMax1);

        int difference1 = difference(1000, 2000);
        System.out.println(difference1);

        int squareArea1 = squareArea(10);
        System.out.println(squareArea1);

        int squarePerimeter1 = squarePerimeter(10);
        System.out.println(squarePerimeter1);

        double secToMin = convertSecondsToMinutes(120);
        System.out.println(secToMin);

        double speed = averageSpeed(10000, 5);
        System.out.println(speed);

        double hypotenuse = findHypotenuse(3, 4);
        System.out.println(hypotenuse);
        System.out.println("Гипотенуза при a=5, b=12: " + findHypotenuse(5, 12));

        double radius = circleCircumference(12);
        System.out.println(radius);
        System.out.println("Длинна окружности при radius 15: " + circleCircumference(15));

        double procent = calculatePercentage(100, 10);
        System.out.println(procent);
        System.out.println("5 из 2500 → " + calculatePercentage(2500, 5) + "%");


        double celsus = celsiusToFahrenheit(100);
        System.out.println(celsus);

        double fahrenheit = fahrenheitToCelsius(100);
        System.out.println(fahrenheit);
    }

    public static int sum(int x, int y) {
        // тело метода
        return x + y; // возвращаемое тело метода
    }

    public static int subtract(int c, int d) {
        return c - d;
    }

    public static int multiply(int w, int e) {
        return w * e;
    }

    public static double divide(int q, int z) {
        return (double) q / z;
    }

    public static int findMax(int b, int n) {
        return Math.max(b, n);
    }


    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        return  (part / total) * 100;

    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

        public static double fahrenheitToCelsius(double f) {
            return (f - 32) * 5 / 9;
    }
}


