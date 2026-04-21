import java.util.Scanner;
class Sms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("SELECT ACTION TO PERFORM");
            System.out.println("1>>ADD Student");
            System.out.println("2>>VIEW Students");
            System.out.println("3>>DELETE Student");
            System.out.println("4>>EXIT");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Manager.addStudent(sc);
                    break;
                case 2:
                    Manager.displayStudents();
                    break;
                case 3:
                    System.out.print("Enter Registration Number : ");
                    String reg=sc.nextLine();
                    Manager.deleteStudent(reg);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}