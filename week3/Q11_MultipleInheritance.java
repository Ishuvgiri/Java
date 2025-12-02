// [11] Using Interfaces: Create two interfaces Readable (with a method read()) and Writable (with a method write()). 
// Create a class Book that implements both interfaces. 
// Instantiate a Book object and call both methods.

interface Readable {
    void read();
}

interface Writable {
    void write();
}

class Book implements Readable, Writable {
    @Override
    public void read() {
        System.out.println("Reading the book.");
    }
    
    @Override
    public void write() {
        System.out.println("Writing in the book.");
    }
}

public class Q11_MultipleInheritance {
    public static void main(String[] args) {
        Book book = new Book();
        book.read();
        book.write();
    }
}
