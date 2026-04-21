import java.util.*;
class Manager{
    static Student[] students=new Student[20000];
    static int count = 0;
    static void addStudent(Scanner sc){
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Registration no: ");
        String regNo = sc.nextLine();
        System.out.print("Enter Mobile no: ");
        long mobNo = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Dept.: ");
        String dept = sc.nextLine();
        System.out.print("Enter Address: ");
        String addr = sc.nextLine();
        students[count] = new Student(name, regNo, mobNo, dept, addr);
        count++;

        System.out.println("Student added SUCCESSFULLY....!.");
    }
    static void displayStudents(){
        if(count == 0){
            System.out.println("No students found.");
            return;
        }
        for(int i = 0; i < count; i++){
            students[i].display();
        }
    }
    static void deleteStudent(String regNo){
        for(int i = 0; i < count; i++){
            if(students[i].regNo.equals(regNo)){
                for(int j = i; j < count-1; j++){
                           students[j] = students[j+1];
                }
                count--;
                System.out.println("Student deleted SUCCESSFULLY.....!.");
                return;
            }
        }

        System.out.println("Student NOT FOUND.........!");
    }
}