package d11_09;

public class Book {
    private int isbn;

    private String title;

    private int year;

    private Author author;

    public Book(){}

    public Book(int isbn, String title, int year, Author author){
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printBookInformation(){
        System.out.println(isbn);
        System.out.println(title + " - " + year);
        if (author != null){
            System.out.print("Author: ");
            this.author.printAuthorInformation();
        }

    }
}
