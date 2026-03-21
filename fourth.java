//demonstrating method overriding and method overloading


class Animal{
 
	String animal_type = "Terrestrial Animal";

	void sayHello(){
		System.out.println("Hello");
 	}
}

class Dog extends Animal{

	String name = "Wolfy";
	
	void sayHello(){
		System.out.println("Woof");
	}

	void sayHello(int number){
		for(int i = 0 ; i <= number ; i ++)
		   {
			System.out.println("Woof");
		}
	}

	public static void main (String[] args){
		Dog name1 = new Dog();
		name1.sayHello();
		name1.sayHello(5);
		
	}

}