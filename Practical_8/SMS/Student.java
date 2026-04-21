class Student{

    String name;
    String regNo;
    long mobNo;
    String dept;
    String addr;

    Student(String name,String regNo ,long mobNo,String dept,String addr){
        this.name=name;
        this.regNo=regNo;
        this.mobNo=mobNo;
        this.dept=dept;     
        this.addr=addr;     
   
    }
    void display(){
        System.out.println("Name: " +name);
        System.out.println("Registration number: " +regNo);
        System.out.println("Mobile No: " +mobNo);
        System.out.println("Department: " +dept);
        System.out.println("Address: " +addr);
        System.out.println();
    }

}