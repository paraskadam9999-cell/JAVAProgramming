import java.util.Scanner;
class Library{
    static Book[] books = new Book[10000];
    static int count=0;
    static void addBook(Scanner sc){
        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        books[count]=new Book(name, author, id);
        count++;
        System.out.println("Book added successfully.");
    }
    static void viewBooks(){
        if(count == 0){
            System.out.println("No books available.");
            return;
        }
        for(int i=0;i<count;i++){
            books[i].display();
        }
    }
    static void deleteBook(int id){
        for(int i=0;i<count; i++){
            if(books[i].bookId == id){
                for(int j = i; j < count-1; j++){
                    books[j] = books[j+1];
                }
                count--;
                System.out.println("Book deleted SUCCESSFULLY....!");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}