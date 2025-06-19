class LibraryHK{
    String[] books;
    int no_of_books;
    LibraryHK(){
        this.books = new String[100];
        this.no_of_books=0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        this.no_of_books++;
    }

    void showAvailableBooks(){
        System.out.println("Available Books...");
        for(int i=0; i<this.books.length; i++){
            if(books[i] == null){
                continue;
            }
            System.out.println("* "+books[i]);
        }
        // System.out.println("Debugging");
        // for(String b:books){
        //     System.out.println(b);
        // }
    }

    void issueBooks(String book){
        for(int i=0; i<this.books.length; i++){
            // String b = this.books[i];
            if(this.books[i] == book){
            // if(this.books[i].equals(book)){
                System.out.println("\nThe book " +  book +" has been issued!\n");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("\nThe book does not exist");
    }

    void returnBooks(String book){
        for(int i=0; i<this.books.length; i++){
            if(books[i] == null){
                books[i] = book;
                System.out.println("\nThanks for returnig the book..\n");
                break;
            }
        }
    }
}

public class LibraryH {
    public static void main(String[] args) {
        
        LibraryHK MyLibrary = new LibraryHK();
        MyLibrary.addBook("Rich Dad Poor Dad");
        MyLibrary.addBook("DBMS");
        MyLibrary.addBook("Java");
        MyLibrary.addBook("C++");
        MyLibrary.showAvailableBooks();
        MyLibrary.issueBooks("Javas");
        MyLibrary.showAvailableBooks();
        // MyLibrary.returnBooks("Java");
        // MyLibrary.showAvailableBooks();
    }
}
