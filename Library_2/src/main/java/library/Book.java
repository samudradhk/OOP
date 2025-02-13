/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author Samudra Bryandhika P
 */
public class Book {
    
    public String title,isbn;
    public Author author;
    
    public Book(String title, String isbn,Author autor){
        this.title = title;
        this.isbn = isbn;
        this.author = autor;
    }
}
