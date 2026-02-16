public class Main{
    public static void main(String[] args){
        Library myLibrary = new Library("Central Library", "1 Main St");
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "LOTR123", "Fantasy", 5);
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", "PP456", "Classic", 3);
        myLibrary.addNewBook(book1);
        myLibrary.addNewBook(book2);
        System.out.println("Books in Library:");
        myLibrary.showAllBooks();
    }
}