package practice3.staticFinalPractice;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    University(int someStudentID, String someStudentName) {
        this.studentName = someStudentName;
        this.studentID = someStudentID;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    String getStudentName() {
        return studentName;
    }

    void printStudentInfo() {
        System.out.println("Имя: " + studentName);
        System.out.println("ID студента: " + studentID);
        System.out.println("Университет: " + universityName);
    }

    public static void main(String[] args) {
        changeUniversityName("МГУ");
        University student1 = new University(10, "Ivan");
        University student2 = new University(11, "Vasya");
        University student3 = new University(12, "Fedya");
        System.out.println("инфо о студентах");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
    }
}
