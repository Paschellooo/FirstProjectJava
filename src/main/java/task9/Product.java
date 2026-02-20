package task9;

public class Product {
    double price;
    String name;
    Product(double anyPrice , String anyName){
        this.name = anyName;
        this.price = anyPrice;
    }
    double getPrice(){
        return  this.price;
    }
    void setPrice(double newPrice){
        this.price = newPrice;
    }
    public double applyDiscount (double discount){
     return price * (1.0 - discount / 100.0);
    }
    void printInfo(){System.out.println("товар " + name + " цена " + price);
    }
}
