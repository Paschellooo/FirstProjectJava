package practice3.staticFinalPractice;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;
    public Library (String bookTitle, String author, int year, String category){};

    private String getBookTitle() {
        return bookTitle;
    }
        protected String getAuthor(){
            return author;
        }
        int getYear(){
        return year;
        }
        public String getCategory(){
        return category;
        }
        private void setBookTitle(String newBookTitle){
        this.bookTitle = newBookTitle;
        }
        protected void author(String newAuthor){
        this.author = newAuthor;
        }
        void setYear(int newYear){
        this.year = newYear;
    }
    public void setCategory(String newCategory){
        this.category = newCategory;
    }
}
