// demonstrating Parent Reference - Child Object

class Animal{
 
	String animal_type = "Terrestrial Animal";

	void sayHello(){
		System.out.println("Hello");
	}	
		
	Animal(String _type){
		System.out.println("Hi , I am a "+ _type);
	}
 	
}

class Dog extends Animal{

	String name = "Wolfy";
	
	void sayHello(){
		System.out.println("Woof");
	}

	Dog(String _name){	
		super("Dog");
		System.out.println("Hi , my name is "+ _name);
	}

	public static void main (String[] args){
		Animal name1 = new Dog("Vilgax");
		name1.sayHello();
		System.out.print(name1.animal_type);	
		
	}

}