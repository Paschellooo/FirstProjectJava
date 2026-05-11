package practice3.staticFinalPractice;

public class Person {
    private String firstName;
    private String lastName;
    private final int ssn;
    Person (String firstName , String lastName , int ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return  lastName;
    }
    public  int getSsn(){
        return ssn;
    }
    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    public void printPersonInfo() {
        System.out.println("Имя " + firstName);
        System.out.println("Фамилия " + lastName);
        System.out.println("полис " + ssn);
    }
public static void main (String[] args){
     Person man = new Person("petr" , "leov" , 123456789);
    Person man2 = new Person("Ivan" , "Perov" , 1234567800);
    System.out.println("первичная информация");
    man.printPersonInfo();
    man.setFirstName("Vasya");

    System.out.println("после изменения информация");
    man.printPersonInfo();
    man2.printPersonInfo();
}
}