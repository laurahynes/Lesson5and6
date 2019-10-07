package Lesson6;

public class Book {

    private String author;
    private String title;

    public Book(String t, String a) {
        title = t;
        author = a;
    }
    
    public String toString(){
        String str = ("Title: " + title + "\nAuthor: " + author + "\n------------------------\n");
        return str;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    
}
