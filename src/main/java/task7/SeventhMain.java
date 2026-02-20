package task7;

public class SeventhMain {
    public static void main (String[] args){
        Circle one = new Circle(30);
        System.out.println("Начальный радиус: " + one.getRadius());
        one.setRadius(50);
        System.out.println("Изменили радиус: " + one.getRadius());
double calculateArea1 = one.calculateArea();
System.out.println("площадь равна " + calculateArea1);
double calculateCircumference1 = one.calculateCircumference();
System.out.println("длинна окружности равна " + calculateCircumference1);

    }
}
