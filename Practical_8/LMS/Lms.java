import java.util.Scanner;
class Lms {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("LIBRARY MANAGEMENT SYSTEM");
            System.out.println("1>> ADD Book");
            System.out.println("2>> VIEW Books");
            System.out.println("3>> DELETE Book");
            System.out.println("4>> EXIT");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    Library.addBook(sc);
                    break;
                case 2:
                    Library.viewBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    Library.deleteBook(id);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}