package task3;

public class Book {
    private String title;
   private String author;
    Book (String anyTitle , String anyAuthor){
        title = anyTitle;
        author = anyAuthor;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
   public void setTitle (String title){
        this.title = title;
    }
    public void setAuthor (String author){
        this.author = author;
    }
    void printInfo(){System.out.println("Автор " + author +   " , Название книги - " + title);
    }
}
