package practice3.staticFinalPractice;

public class Person {
    private String firstName;
            private String lastName;
            private final String ssn;

            Person (String someFirstName , String someLastName, String someSsn){
                this.firstName = someFirstName;
                this.lastName = someLastName;
                this.ssn = someSsn;
            }

            String getFirstName(){
                return firstName;
            }

            String getLastName(){
                return lastName;
            }

            String getSnn(){
                return ssn;
            }

            void setFirstName(String newFirstName){
                this.firstName = newFirstName;
            }

            void setLastName(String newLastName){
                this.lastName = newLastName;
            }
            void printPersonInfo(){
                System.out.println("Имя - " + firstName + " Фамилия - " + lastName + " SSN " + ssn) ;
            }
            public static void main (String[]  arg){
                Person zero = new Person("Иван", "Иванов", "123-45-6789");
                Person first = new Person ("Павел ", "Петров ", "123-45-6780"  );
                Person second = new Person ("Георгий ", "Геворг ", "123-45-6780"  );
                zero.printPersonInfo();
                first.printPersonInfo();
                second.printPersonInfo();
second.setFirstName("Виталь");
                System.out.println("Изменили имя для второго:");
                second.printPersonInfo();

            }
}
