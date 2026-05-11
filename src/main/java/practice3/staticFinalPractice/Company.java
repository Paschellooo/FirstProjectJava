package practice3.staticFinalPractice;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public static void printCompanyName() {
        System.out.println("Название компании: " + companyName);
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    void setEmployeeName(String newEmployeeName) {
        this.employeeName = newEmployeeName;
    }

    public int getEmployeeID() {
        return this.employeeID;
    }

    public static void main(String[] args) {
        Company.companyName = "строитель";

        Company employee1 = new Company(101, "Анна Иванова");
        Company employee2 = new Company(102, "Пётр Сидоров");
        Company employee3 = new Company(103, "Мария Козлова");

        System.out.println("=== Первоначальное состояние ===");
        Company.printCompanyName();

        System.out.println("\n=== Данные сотрудников до изменения компании ===");
        System.out.println("Сотрудник 1: ID=" + employee1.getEmployeeID() + ", имя=" + employee1.getEmployeeName() + ", компания=" + Company.companyName);
        System.out.println("Сотрудник 2: ID=" + employee2.getEmployeeID() + ", имя=" + employee2.getEmployeeName() + ", компания=" + Company.companyName);
        System.out.println("Сотрудник 3: ID=" + employee3.getEmployeeID() + ", имя=" + employee3.getEmployeeName() + ", компания=" + Company.companyName);

        System.out.println("\n=== Меняем название компании ===");
        Company.companyName = "водитель";

        System.out.println("\n=== Данные сотрудников после изменения компании ===");
        System.out.println("Сотрудник 1: ID=" + employee1.getEmployeeID() + ", имя=" + employee1.getEmployeeName() + ", компания=" + Company.companyName);
        System.out.println("Сотрудник 2: ID=" + employee2.getEmployeeID() + ", имя=" + employee2.getEmployeeName() + ", компания=" + Company.companyName);
        System.out.println("Сотрудник 3: ID=" + employee3.getEmployeeID() + ", имя=" + employee3.getEmployeeName() + ", компания=" + Company.companyName);
    }
}
