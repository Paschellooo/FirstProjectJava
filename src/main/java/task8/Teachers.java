package task8;

public class Teachers {
    String name;
    String subject;
    Teachers (String someName, String someSubject){
        this.name = someName;
        this.subject = someSubject;}
        String getName(){
            return this.name;
        }
        String getSubject(){
        return this.subject;
    }
    void setName(String newName){
        this.name = newName;
    }
    void setSubject(String newSubject){
        this.subject = newSubject;
    }
    void  printInfo(){System.out.println("Имя учителя " + name + " ведёт предмет " + subject);}
}
