package task5;

public class Point {
    int x;
    int y;
    Point (int someX , int someY){
        x = someX;
        y = someY;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void setX(int newX){
        x = newX;
    }
    void print(){
        System.out.println("Кординаты x " + x + " кординаты y " + y );
    }
}
