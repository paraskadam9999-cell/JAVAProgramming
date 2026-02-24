import java.util.Scanner;

public class Sy2024bit055{
    void pp1(int size)
    {
        for(int i=1;i<size;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=(((2*size)-1)-(2*i));k++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    for(int i=1;i<(size*2);i++)
    {
        System.out.print("*");
    }
}


      void pp2(int size)
    {
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=size;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            }
                
        }


 
    void pp4(int size)
    {
        int num=1;
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("%3d ",num);
                num++;
            }
            System.out.println();
            }
                
        }

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter Size : ");
    int size=sc.nextInt();

    Sy2024bit055 obj1 = new Sy2024bit055();

    //obj1.pp1(size);
    //obj1.pp2(size);
    obj1.pp4(size);
}
}
