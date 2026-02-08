package org.example;

public class MathOps{
    public static void main(String[]args){
int sum1 = sum(14, 12);
System.out.println(sum1);

int subst = subtract(14, 12);
System.out.println(subst);

int mult = multiply(4, 2);
System.out.println(mult);

double divide1 = divide(3, 2);
System.out.println(divide1);

int findMax1 = findMax(1000, 2222);
System.out.println(findMax1);

int square1 = squareArea(10);
System.out.println(square1);

int perrimetr1 = squarePerimeter(20);
System.out.println(perrimetr1);

int diference1 = difference(10, 9);

double seconds1 = secToMin(4000);
System.out.println(seconds1);

double avaregeSpeed22 = averageSpeed(3000 , 200);
System.out.println("Расстояние деленное на время =" + avaregeSpeed22);

double findHiponuse1 = findHypotenuse(32,20);
System.out.println(findHiponuse1);

double radius = circleCircumference(30);
System.out.println(radius);

double procent = calculatePercentage(1000, 30);
System.out.println("процент от числа" + procent);

double cels = celsiusToFahrenheit(100);
System.out.println(cels);

double far = fahrenheitToCelsius(200);
System.out.println(far);



    }
    public static int sum(int x , int y){
        return x + y;
    }
    public static int subtract(int x , int y){
        return x - y;}

    public static int multiply(int x , int y){
        return x * y;
    }

    public static double divide (double x , double y) {
        return x / y;
    }

    public static int findMax(int a , int b){
        return Math.max(a, b);
    }

    public static int difference(int x , int y){
        return x - y;}

    public static int squareArea (int side){
        return side * side;}
    public static int squarePerimeter(int side) {
        return 4 * side;
    }
public static double secToMin (double seconds){
    return  seconds / 60;
}
public static double averageSpeed(double distance, double time){
        return distance / time;
}

   public static double findHypotenuse(double a, double b){
        return Math.sqrt(a*a + b*b);
   }
   public static double circleCircumference(double radius){
        return 2 * Math.PI * radius;
   }
   public static double  calculatePercentage(double total, double part){
        return (part / total) * 100;
   }
   public static double celsiusToFahrenheit(double c){
    return c * 9 / 5 + 32;}
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

}