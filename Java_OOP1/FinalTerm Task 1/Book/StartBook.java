// ID: 23-54110-3
// MD. MINHAJ ROWFUN RABBI ANIK
import java.util.Scanner;
public class StartBook {
    public static void main(String[] args) {
        Scanner scNum = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
        BookList bookList = new BookList(100);
        int choice;
        while(true){
            System.out.println("*** Welcome to Library Management System ***");
            System.out.println("1. Show Available Books");
            System.out.println("2. Insert a New Book");
            System.out.println("3. Show a Book");
            System.out.println("4. Delete a Book");
            System.out.println("5. Search a Book By Name");
            System.out.println("0. Exit");
			System.out.println("*******************************************");
            System.out.print("Enter your choice: ");

            choice = scNum.nextInt();
            switch (choice) {
                case 1:
                    bookList.showAll();
                    break;
                case 2:
					System.out.print("Enter book name: ");
					String bookName = scStr.nextLine();
					System.out.print("Enter book author: ");
					String bookAuthor = scStr.nextLine();
					System.out.print("Enter book ID (unique identifier): ");
					String bookId = scStr.nextLine();
					System.out.print("Enter book type: ");
					String bookType = scStr.nextLine();
					System.out.print("Enter number of copies: ");
					int bookCopy = scNum.nextInt();
					Book b=new Book(bookName, bookAuthor, bookId, bookType, bookCopy);
                    bookList.insert(b);
                    break;
                case 3:
                    System.out.print("Enter book name to show: ");
                    String Name = scStr.nextLine();
                    Book book = bookList.getByName(Name);
                    if (book != null) {
                        book.showDetails();
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter book name to delete: ");
                    bookName = scStr.nextLine();
                    bookList.remove(bookName);
                    break;
                case 5:
                    System.out.print("Enter book name to search: ");
                    bookName = scStr.nextLine();
                    book = bookList.getByName(bookName);
                    if (book != null) {
                        System.out.println("Book found!");
                        book.showDetails();
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;
                case 0:
                    System.out.println("Exiting Library Management System...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
			if(choice==0) break;
        }
    }
}