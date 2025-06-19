import java.util.Arrays;

class Library {
    private String[] availBooks = new String[20];
    private String[] issuedBooks = new String[10];

    public void addBook(String... books) {
        if (books.length <= availBooks.length) {
            for (int i = 0; i < books.length; i++) {
                availBooks[i] = books[i];
            }
        }
    }

    public void issueBooks(String... books) {
        // if (availBooks.length > 0) {
        //     for (int i = 0; i < books.length; i++) {
        //         for (int j = 0; j < availBooks.length; j++) {
        //             if (books[i] == availBooks[j]) {
        //                 System.out.println(
        //                         "Book issued to you");
        //                 issuedBooks[j] = books[i];
        //             } else {
        //                 System.out.println("Book is not currently availabe");
        //                 break;
        //             }
        //         }
        //     }
        // }
        System.out.println("\nRequesting for book/s...");
        for(int i=0; i<books.length; i++){
            System.out.print(books[i] + " ");
        }
        System.out.println();
        boolean found = false;
        for(int i=0; i<books.length; i++){
            for(int j=0; j<availBooks.length; j++){

                if(books[i] == availBooks[j]){
                    if(availBooks[j] == null){
                        continue;
                    }
                    // availBooks[j] = availBooks[j+1];
                    found = true;
                    availBooks[j] = null;
                    // System.out.println("Book/s "+books[i]+ " issued to you");   
                }
            }
            if(found){
                issuedBooks[i] = books[i];
                System.out.println(books[i]+ " issued" );
                found = false;
                for(int k=0; k<availBooks.length; k++){
                    
                }
            }
            else{
                System.out.println(books[i] + " is not currently available");
            }
        }  
         
    }

    public void returnBooks(String... books) {
       String[] newBook = new String[issuedBooks.length];
       for(int i=0; i<books.length; i++){
        newBook[i] = books[i]; 
        System.out.print(newBook[i] + " ");
       }
       if(Arrays.equals(newBook, issuedBooks)){
        for(int i=0; i<books.length; i++){
            issuedBooks[i] = null;
        }
        System.out.println("Thanks for returning books on time...");
       }
       else{
        System.out.println("Please return all books that you have taken");
       }
    }

    public void showBooks() {
        System.out.println("\nBooks Available in Library..");
        if (availBooks.length > 0) {
            int c = 0;
            for (String e : availBooks) {
                c += 1;
                if(e == null){
                    continue;
                }
                System.out.println("Book-> " + e);
            }
        } else {
            System.out.println("No Books availabe");
        }
    }

    public void checkIssueBk() {
        System.out.println("\nIssued Books");
        if(issuedBooks[1] != null){
        for (String b : issuedBooks) {
            if(b == null){
                continue;
            }
            System.out.println(b);
        }
    }
    else{
        System.out.println("No books Issued");
    }
    }

}

class Library_IV {
    public static void main(String[] args) {

        Library l = new Library();
        l.addBook("dbms" ,"java", "cn", "python", "php");
        l.showBooks();
        l.checkIssueBk();
        l.issueBooks("python", "dbms");
        l.showBooks();
        l.checkIssueBk();
        l.returnBooks("python", "dbms");
        l.checkIssueBk();
    }

}
