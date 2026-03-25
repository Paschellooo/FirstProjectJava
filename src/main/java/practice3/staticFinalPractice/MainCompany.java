package practice3.staticFinalPractice;

public class MainCompany {
    public static void main (String[] args){
        Company employee1 = new Company(11 , "Сидоров" , "Tesla");
        Company employee2 = new Company(12 , "Смирнов" , "Тесла");
    Company.printCompanyName();
    Company.companyName = "Lamborgini";
       System.out.println("новое название компании " + Company.companyName);

    }
}
