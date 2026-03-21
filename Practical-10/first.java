// demonstrating single level inheritance

class Animal{
 
	String animal_type = "Terrestrial Animal";

	void sayHello(){
		System.out.println("Hello");
 	}
}

class Dog extends Animal{

	String name = "Wolfy";
	
	void sayWoof(){
		System.out.println("Woof");
	}

	public static void main (String[] args){
		Dog name1 = new Dog();
		name1.sayHello();
		name1.sayWoof();
	}

}