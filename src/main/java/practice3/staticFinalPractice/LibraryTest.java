package practice3.staticFinalPractice;
public class LibraryTest {
    public static void main(String[] args) {
        Library books = new Library("Маргарита", "Толстой", 1812, "Роман");
        System.out.println("=== Проверка доступа к полям ===");
        // приватное поле нет прямого доступа, тольк через геттер    System.out.println(books.bookTitle);
        System.out.println(" Через геттер - " + books.getBookTitle());
        books.setBookTitle("Мастер и маргарита");
        System.out.println(" изменили заголовок " + books.getBookTitle());
System.out.println(books.author);
System.out.println(books.year);
System.out.println(books.category);

    }
}
