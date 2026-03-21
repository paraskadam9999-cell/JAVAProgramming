// demonstrating Multi-level inheritance

class Organism{
	String _type="Living";

	void sayType(){
		System.out.println("Hi, I am a Living Organism");
	}
}

class Person extends Organism {
	String _type = "Human";

	void sayHi(){
		System.out.println("Hi, I am a Human");
	}
}

class Student extends Person{
	String department = "IT";

	void sayHii(){
		System.out.println("Hii, I am a Student");
	}

	public static void main (String[] args){
		Student s1 = new Student();
		s1.sayType();
		s1.sayHi();
		s1.sayHii();
	}
}
