// ID: 23-54110-3
// MD. MINHAJ ROWFUN RABBI ANIK
public class StartBook{

	public static void main(String[] args){
		Book a=new Book();
		a.setBookName("A Tale");
		a.setBookAuthor("Alamgir");
		a.setBookId("1");
		a.setBookType("Science");
		a.setBookCopy(10);
		a.showDetails();
		Book b=new Book("Beauty and Beast", "Selina", "2", "Romance", 20);
		b.showDetails();
		Book c=new Book("Child Labours", "Steve", "3", "Science", 30);
		c.showDetails();
		Book d=new Book("Dogs and Cats", "Johnson", "4", "", 40);
		d.addBookCopy(10);
		d.showDetails();
		
		System.out.print("Unique Book number: ");
		Book.totalNumberOfUniqueBooks();
	}
}
