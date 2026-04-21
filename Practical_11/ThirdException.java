import java.io.*;
class ThirdException{

	public static void main(String[] args) {
			
		try{
			FileReader f=new FileReader("ThirdException.java");

		}
		catch(FileNotFoundException msg){
			System.out.println("1>>>FileNotFoundException................");
		}



		try{
		
			int [] nums=new int[10];
			nums[10]=10;
		}
		catch(ArrayIndexOutOfBoundsException msg){
			System.out.println("2>>>ArrayIndexOutOfBoundsException................");			
		}



		try{
			
			int num=20;
			num=num/0;
		}
		catch(ArithmeticException msg){
			System.out.println("3>>>ArithmeticException...................");
		}


			
	}

}

