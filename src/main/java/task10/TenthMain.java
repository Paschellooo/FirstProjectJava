package task10;

public class TenthMain {
    public static void main (String[] args){
        Laptop lenovo = new Laptop(10000 , "lenovo");
        lenovo.printInfo();
        lenovo.setPrice(15000);
        System.out.println(" новая цена ноутбука " + lenovo.getPrice() );
    }
}
