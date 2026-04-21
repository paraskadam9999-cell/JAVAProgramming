class Sample{
	static int count(char ch,String s){
		int counter=0;
		char [] arr=s.toCharArray();

		for(char c : arr){
			if(c==ch){
				counter++;
			}
		}
		





		
		return counter;
	}

	public static void main(String[] args){
		char ch=args[0].charAt(0);
		String  s=args[1];	
		int occurance=count(ch,s);
		System.out.println("Occurance:"+occurance);
			
	}


}





