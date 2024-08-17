// 15.	Constructor:3 
// ●	Write a Java program that defines a class Book with attributes like title and author. Include a parameterized constructor to initialize these attributes when creating an object.
class Book
{
    private String title;
    private String author;

    public Book(String bookTitle,String bookAuthor)
    {
        this.title = bookTitle;
        this.author = bookAuthor;
    }
    public void getDetails()
    {
        System.out.format("The title of the book is %s and was written by %s",this.title,this.author);
    }
}
public class Question15 {
    public static void main(String[] args) {
        Book myBook = new Book("Karma","Sadhguru");
        myBook.getDetails();
    }
}
