package practice3.staticFinalPractice;

public class Library{
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    public String getBookTitle() {
        return bookTitle;
    }
     public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    protected String getAuthor(){
        return author;
    }
    protected void setAuthor(String author){
        this.author = author;
    }
     int getYear(){
        return year;
    }
     void setYear(int year){
        this.year = year;
    }
     public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    Library (String bookTitle , String author , int year , String category){
        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
        this.category = category;
    }
}
