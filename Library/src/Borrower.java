import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Borrower {
    String name;
    private final List<Book>borrowed;
    
    public Borrower(String name){
        this.name = name;
        this.borrowed = new ArrayList<>();
    }
    
    public void borrowBook(Book book){
        borrowed.add(book);
    }
    
    public int removeBook(Book book){
        if(borrowed.remove(book)) return 1;
        return -1;
    }
    
    void displayBorrowedBooks(){
        System.out.println(name+" borrowed : ");
        for (Book book : borrowed) {
            System.out.println(" Title: " + book.title);
            System.out.println(" ISBN: " + book.isbn);
            System.out.println(" Author: " + book.author);
            System.out.println(" Biography: " + book.author.bio);
            System.out.println("--------------------------------------------");
        }
    }
}
