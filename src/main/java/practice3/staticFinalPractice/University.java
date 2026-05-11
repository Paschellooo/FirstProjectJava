package practice3.staticFinalPractice;
//

public class University {
    static String universityName;
    final int studentID;
    String studentName;
    University (int studentID , String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }
    public static void changeUniversityName(String newName){
        universityName = newName;
    }
    public String getStudentName(){
        return studentName;
    }
    public void printStudentInfo(){
        System.out.println("Инфо о студентах");
        System.out.println("Имя " + studentName);
        System.out.println("ID " + studentID);
        System.out.println("Универ " + universityName );
    }
    public static void main(String[] args){
        University.changeUniversityName("MGU");
        University student1 = new University(1, "Иван");
        University student2 = new University(2 , "Федя");
        University student3 = new University(3 , "Женя");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
    }
}