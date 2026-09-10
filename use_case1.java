public class use_case1{
   public static void main(String[] args) {
       Book b1 = new Book("Java Basics", "J. Author", 350.0, "ISBN001");
       Book b2 = new Book("OOP Concepts", "K. Writer", 420.0, "ISBN002");
 
       System.out.println(b1.getTitle() + " by " + b1.getAuthor());
       System.out.println("Price: " + b2.getPrice());
       System.out.println("Library: " + Book.libraryName);
       System.out.println("Total books added: " + Book.bookCount);
   }
}


class Book{
    private String title;
    private String author;
    private double price;
    private String isbn;
    final static  String libraryName="Sunrise Public Library";
    static int bookCount=0;
    Book(String T, String A, double P, String I) {
        this.title = T;
        this.author = A;
        this.price = P;
        this.isbn = I;
        ++bookCount;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String T){
        this.title=T;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String A){
        this.author=A;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double P){
        this.price=P;
    }
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String I){
        this.isbn=I;
    }
}