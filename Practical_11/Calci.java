import java.util.Scanner;

class Calci{
	
	static double calculate(double num1, double num2, char operator) throws ArithmeticException {
        switch (operator) {
            case '+':
                return num1+num2;

            case '-':
                return num1-num2;

            case '*':
                return num1*num2;

            case '/':
                if (num2==0) {
                    throw new ArithmeticException("Cannot divide any number by 0");
                }
                return num1/num2;

            default:
                throw  new ArithmeticException("Invalid operator");
        }
    }



	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Calculator Created By Aryan-2024BIT020");	
	int choice=1;
	while(choice==1){
		try{
			System.out.println("Enter first Number:");
			double num1=sc.nextDouble();

			System.out.println("Enter Second Number");
			double num2=sc.nextDouble();

			System.out.println("Enter Operation to Perform:");
			System.out.println(" +  ,  -  ,*  ,/  ");
			char operator=sc.next().charAt(0);

			double result = calculate(num1, num2, operator);
			System.out.println("Result: "+result);
			
		}
		catch(ArithmeticException msg){
			System.out.println(msg);
		}
		catch(Exception msg){
 			System.out.println("Invalid input!please enter correct values.");		
		}
		System.out.print("Do you want to continue? YES-1   /     NO-0: ");
           	 choice = sc.nextInt();
		
		}
		sc.close();
	}


}
















 