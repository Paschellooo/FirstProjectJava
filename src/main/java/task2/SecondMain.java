package task2;

public class SecondMain {
    public static void main(String[] args) {
        // 1. Создаём прямоугольник 20×20
        Rectangle rectangle = new Rectangle(20, 20);

        // 2. Выводим исходную площадь (20 * 20 = 400)
        System.out.println("Исходная площадь: " + rectangle.calculateArea());

        // 3. Меняем ширину на 40
        rectangle.setWidth(40);

        // 4. Выводим новую площадь (40 * 20 = 800)
        System.out.println("Новая площадь: " + rectangle.calculateArea());
    }
}
