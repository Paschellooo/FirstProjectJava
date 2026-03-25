package practice2.task1;

public class Car {
    String brand;
    int year;
    Car (String someBrand , int someYear){
        this.brand = someBrand;
        this.year = someYear;
    }
    int getYear(){
        return this.year;
    }
    String getBrand(){
     return this.brand;
    }
    void setYear(int newYear){
        this.year = newYear;
    }
    void setBrand(String newBrand){
        this.brand = newBrand;
    }
    void print(){
        System.out.println("бренд авто " + this.brand + ",год выпуска " + this.year ); // здесь хотелось бы исправить что вторая печать после
    } //сеттера но не знаю точно как сделать.
}





//public class Car {
//    int year;
//    String brand;
//    Car (int anyYear , String anyBrand ){
//        this.year = anyYear;
//        this.brand = anyBrand;
//    }
//    int getYear(){
//        return this.year;
//    }
//    String getBrand(){
//        return this.brand;
//    }
//    void setYear(int newYear){
//        this.year = newYear;
//    }
//    void setBrand (String newBrand){
//        this.brand = newBrand;
//    }
//    void print(){
//        System.out.println( "марка авто " + brand + "год выпуска" + year);
//    }
//
//}
