package task6;

public class StudentGroup {
    int studentCount;
    String groupName;
    StudentGroup (int firstStudentCount , String firstGroupName){
        this.studentCount = firstStudentCount;
        this.groupName = firstGroupName;
    }
    int getStudentCount(){
        return this.studentCount;}

        String getGroupName(){
            return this.groupName;
        }
        void setStudentCount (int newStudentCount){
        this.studentCount = newStudentCount;
        }
        void setGroupName (String newGroupName){
        this.groupName = newGroupName;
        }
        void printInfo(){System.out.println("Колличество студентов " + studentCount + ", Название группы "
        + groupName );}
    }

