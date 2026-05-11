package practice3.staticFinalPractice;

public class MathConstants{
    public static final double PI = 3.14159;
    public static final double E = 2.71828;
    public static double calculateCircleArea(double r){
        return PI * r * r;
    }
    public static double calculateCircumference(double r){
        return 2 * PI * r;
    }
    public static double calculateExponentialGrowth(double initialValue, double rate, double time){
        return initialValue *Math.exp(rate * time);
    }
    public static void main (String[] args){
        System.out.println("площадь круга при радиусе 2 " + calculateCircleArea(2));
        System.out.println("длина окружности при значкении 3 " + calculateCircumference(3));
        System.out.println("экспотенциальный рост при значения 2 - 3 - 4" + calculateExponentialGrowth(2,3, 4));
    }
}
