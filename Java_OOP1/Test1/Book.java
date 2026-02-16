public class Book{
    private String bookName;
    private String bookAuthor;
    private String bookId;
    private String bookType;
    private int bookCopy;
    public Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
        this.bookType = bookType;
        this.bookCopy = bookCopy;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public void showInfo() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Type: " + bookType);
        System.out.println("Number of Copies: " + bookCopy);
    }
    public void addBookCopy(int x) {
        bookCopy += x;
    }
}
