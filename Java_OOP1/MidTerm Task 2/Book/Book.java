// ID: 23-54110-3
// MD. MINHAJ ROWFUN RABBI ANIK
public class Book{
	
	// Members
	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy; // copy of book
	static int uniqueBookCounter=0;
	
	// Constructor
	Book(){
		System.out.println("E-Constructor");
		uniqueBookCounter++;
	}
	Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy){
		System.out.println("P-Constructor");
		uniqueBookCounter++;
		setBookName(bookName);
		setBookAuthor(bookAuthor);
		setBookId(bookId);
		setBookType(bookType);
		setBookCopy(bookCopy);
	}
	
	// Setter Methods
	public void setBookName(String bookName){
		this.bookName=bookName;
	}
	public void setBookAuthor(String bookAuthor){
		this.bookAuthor=bookAuthor;
	}
	public void setBookId(String bookId){
		this.bookId=bookId;
	}
	public void setBookType(String bookType){
		this.bookType=bookType;
	}
	public void setBookCopy(int bookCopy){
		this.bookCopy=bookCopy;
	}
	public void addBookCopy(int x){
		this.bookCopy+=x;
	}
	
	// Getter Methods
	static void totalNumberOfUniqueBooks(){ //shows the value of uniqueBookCounter
		System.out.println(uniqueBookCounter);
	}
	public void showDetails(){
		System.out.println("Book Name: "+this.bookName);
		System.out.println("Book Author: "+this.bookAuthor);
		System.out.println("Book Id: "+this.bookId);
		System.out.println("Book Type: "+this.bookType);
		System.out.println("Book Copy: "+this.bookCopy+"\n\n");
	}
	
}
