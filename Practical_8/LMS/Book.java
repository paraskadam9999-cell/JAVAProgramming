class Book {
    String bookName;
    String author;
    int bookId;
    Book(String bookName, String author, int bookId){
        this.bookName = bookName;
        this.author = author;
        this.bookId = bookId;
    }
    void display(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Book ID: " + bookId);
        System.out.println();
        System.out.println();
        System.out.println();
    }
}