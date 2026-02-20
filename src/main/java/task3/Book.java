package task3;

public class Book {
    String title;
    String author;
    Book (String anyTitle , String anyAuthor){
        title = anyTitle;
        author = anyAuthor;
    }
    String anyTitle(){
        return title;
    }
    String anyAuthor(){
        return author;
    }
    void anyTitle (String newTitle){
        title = newTitle;
    }
    void setAuthor (String newAuthor){
        author = newAuthor;
    }
    void printInfo(){System.out.println("Автор " + author +   " , Название книги - " + title);
    }
}
