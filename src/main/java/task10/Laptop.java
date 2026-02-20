package task10;

public class Laptop {
    int price;
    String brand;
    Laptop (int somePrice, String someBrand){
        this.brand = someBrand;
        this.price = somePrice;
    }
   int getPrice(){
        return  this.price;
   }
   String getBrand(){
        return this.brand;
   }
   void setPrice(int newPrice){
        this.price = newPrice;
   }
   void setBrand (String newBrand){
        this.brand = newBrand;
   }
   void printInfo(){
        System.out.println("модель ноутбука " + brand  + " цена ноутбука " + price);
    }
}
