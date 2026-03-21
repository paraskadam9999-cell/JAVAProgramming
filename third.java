// demonstrating heirarchical inheritance

class Discipline{
	String _type="Engineering";

	void sayType(){
		System.out.println("Engineering Discipline");
	}
}

class IT extends Discipline {
	String _type = "IT";

	void sayName(){
		System.out.println("Information Tech Engg");
	}
}

class Mech extends Discipline{
	String department = "Mechanical";

	void sayName(){
		System.out.println("Mechanical Engg");
	}

	public static void main (String[] args){
		IT i1 = new IT();
		Mech m1= new Mech();
		i1.sayName();
		i1.sayType();
		System.out.println(m1._type);
	}
}
