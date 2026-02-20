package task6;

public class SixthMain {
    public static void main (String[] args){
        StudentGroup first = new StudentGroup(12 , "strong");
        first.printInfo();
        first.setStudentCount(25);
        System.out.println("Количество студентов обновлено. Новое значение: " + first.getStudentCount());
        first.printInfo();
    }
}
