// interface printable
// class book and magazine

interface Printable {
    void print();    
}

abstract class Details{
    // book
    String title;
    String author;

    Details(String title, String author){
        this.title = title;
        this.author = author;
    }

}

class Book extends Details implements Printable{
    
    Book(String title, String author){
        super(title, author);
    }

    public void print(){           // when you use a method from interface make sure its public, otherwise it will throw an error
        System.out.println("Book Title: " + title + ", Author: " + author);
    }

}

class Magazine extends Details implements Printable{
    int issueNumber;

    Magazine(String title, String author, int issueNumber){
        super(title, author);
        this.issueNumber = issueNumber;
    }

    public void print(){
        System.out.println("Magazine Title: " + title + ", Editor: " + author + ", Issue: " + issueNumber);
    }
}

public class a_18_5_2 {
    public static void main(String[] args) {
        Printable[] items = new Printable[5];
        items[0] = new Book("1984", "George Orwell");
        items[1] = new Book("The Alchemist", "Paulo Coelho");
        items[2] = new Magazine("Time", "John Doe", 42);
        items[3] = new Magazine("National Geographic", "Jane Smith", 101);
        
        for (Printable p : items) {
            if (p != null) {
                p.print();
            }
        }
    }
}
