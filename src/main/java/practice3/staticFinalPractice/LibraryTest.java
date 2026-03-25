package practice3.staticFinalPractice;

public class LibraryTest {
    public static void main (String[] args){
        Library books = new Library("Война и мир", "Лев Толстой", 1869, "Классика");
        // System.out.println(books.bookTitle); поле приватное, принадлежит классу, ошибка компиляции при вызове
        System.out.println("author: " + books.author);
        System.out.println("year " + books.year);
        System.out.println("категория " +books.category);
        //System.out.println("title" + books.getBookTitle()); приватный метод, доступен в классе

    }

}
