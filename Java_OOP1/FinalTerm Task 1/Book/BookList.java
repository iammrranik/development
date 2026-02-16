// ID: 23-54110-3
// MD. MINHAJ ROWFUN RABBI ANIK
public class BookList{
    private Book books[];
    // Constructor
    public BookList(){
		// System.out.println("E-Constructor");
        books=new Book[100];
    }
    public BookList(int size){
		// System.out.println("P-Constructor");
        books=new Book[size];
    }
    
    //Features
    public void insert(Book b){
        boolean flag=false;
        for(int i=0; i<books.length; i++){
            if(books[i]==null){
                books[i]=b;
                flag=true;
                break;
            }
        }
        if(flag){System.out.println("Book Saved Successfully.");}
        else{System.out.println("Book is not saved.");}
    }
    public Book getByName(String bookName){
        Book b=null;
        for(int i=0; i<books.length; i++){
            if(books[i]!=null){
                if(books[i].getBookName().equals(bookName)){
                    b=books[i];
                    break;
                }
            }
        }
        return b;
    }
    public void remove(String bookName){
        boolean flag=false;
        for(int i=0; i<books.length; i++){
            if(books[i]!=null){
                if(books[i].getBookName().equals(bookName)){
                    books[i]=null;
                    flag=true;
                    break;
                }
            }
        }
        if(flag){System.out.println("Book Deleted Successfully.");}
        else{System.out.println("No Book with this name.");}
    }
    public void showAll(){
        for(int i=0; i<books.length; i++){
            if(books[i]!=null){
                books[i].showDetails();
            }
        }
    }
}
