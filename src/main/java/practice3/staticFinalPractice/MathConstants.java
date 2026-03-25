package practice3.staticFinalPractice;

public class MathConstants {
    final double PI = 3.14159;
    final double E = 2.71828;

  public static double calculateCircleArea(double r){
        return Math.PI * r * r;
    }
    public static double calculateCircumference(double r){
        return 2 * Math.PI * r;
    }
    public static void main (String[] args){
        System.out.println( "площадь круга при радиусе 2 = " + MathConstants.calculateCircleArea(2));
System.out.println("длинна окружности при радиусе 200 = " +MathConstants.calculateCircumference(200));

    }

}
