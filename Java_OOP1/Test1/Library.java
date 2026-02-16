public class Library {
    private String libName;
    private String libAddress;
    private Book[] books;
    private int totalBook;
    public Library(String libName, String libAddress) {
    this.libName = libName;
    this.libAddress = libAddress;
    this.books = new Book[100];
    this.totalBook = 0;
    }
    public String getLibName() {
        return libName;
    }
    public void setLibName(String libName) {
        this.libName = libName;
    }
    public String getLibAddress() {
        return libAddress;
    }
    public void setLibAddress(String libAddress) {
        this.libAddress = libAddress;
    }
    public void addNewBook(Book book) {
        if (totalBook < books.length){
            books[totalBook] = book;
            totalBook++;
        }else{
            System.out.println("Library is full! Cannot add new book.");
        }
    }
    public void showAllBooks() {
        for (int i = 0; i < totalBook; i++) {
            books[i].showInfo();
        }
    }
}