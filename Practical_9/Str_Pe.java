class Str_Pe{
static void str(){
String s="UTSAV";
long st=System.nanoTime();
for(int i=1;i<=2026;i++){
	s+="_"+i+"_";
}
long et=System.nanoTime();
System.out.println("String:"+(et-st));
}




static void strBuffer(){
StringBuffer s=new StringBuffer("UTSAV");
long st=System.nanoTime();
for(int i=1;i<=2026;i++){
	s.append("_");
	s.append(i);
	s.append("_");
}
long et=System.nanoTime();
System.out.println("StringBuffer:"+(et-st));

}





static void strBuilder(){
StringBuilder s=new StringBuilder("UTSAV");
long st=System.nanoTime();
for(int i=1;i<=2026;i++){
	s.append("_");
	s.append(i);
	s.append("_");
}
long et=System.nanoTime();
System.out.println("StringBuilder:"+(et-st));
}





public static void main(String []args){
	str();
	strBuffer();
	strBuilder();
}

}