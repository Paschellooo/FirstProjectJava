package task9;

public class NinthMain {
    public static void main(String[] args){
       Product one = new Product(10000 ,"butter") ;
       one.printInfo();
       one.setPrice(12200);
        System.out.println("новая цена на масло: " + one.getPrice());
        double applyDiscount1  = one.applyDiscount(10);
       System.out.println("новая цена со скидкой 10% " + applyDiscount1);
    }

}
