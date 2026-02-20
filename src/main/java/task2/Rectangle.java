package task2;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int anyWidth, int anyHeight) {
        this.width = anyWidth;
        this.height = anyHeight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public int calculateArea() {
        return width * height;  // использует поля объекта
    }
}
