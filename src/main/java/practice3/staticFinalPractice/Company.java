package practice3.staticFinalPractice;

public class Company {
    static String companyName = "Mars";
            final int employeeID;
                    String employeeName;
                            Company (int localID , String someEmployeeName, String companyName){
                                this.employeeID = localID;
                                this.employeeName = someEmployeeName;
                            }
    static void printCompanyName(){
                                System.out.println("название компании " + companyName);
    }
    String getEmployeeName(){
                                return this.employeeName;
    }
     void setEmployeeName(String newEmployeeName){
                                this.employeeName = newEmployeeName;
    }
}
