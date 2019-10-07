
package Lesson6;


public class Patron {
    private String name;
    private Book b1, b2, b3;
    
    public Patron(String n){
        name = n;
        b1=null;
        b2=null;
        b3=null;
    }
    
    public boolean borrow(Book b){
        if(b!=null && b2!=null && b3!=null) return false;
        
        if(hasBook(b)) return false;
        
        if(b1==null) b1=b;
        else if(b2==null) b2=b;
        else b3=b;
        return true;
    }
    
    public boolean hasBook(Book book){
        if(b1==book || b2==book || b3==book) return true;
        else return false;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean returnBook(Book book){
        if(b1==book){
            b1=null;
            return true;
        }
        if(b2==book){
            b1=null;
            return true;
        }
        if(b3==book){
            b3=null;
            return true;
        }
        else return false;
    }
}
