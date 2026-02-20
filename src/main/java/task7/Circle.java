package task7;

public class Circle {
    public double radius;
    Circle (double someRadius){
        this.radius = someRadius;
    }
    double getRadius(){
        return this.radius;
    }
    void setRadius(double newRadius){
        this.radius = newRadius;
    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }
}
