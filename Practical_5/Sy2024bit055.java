class Sy2024bit055{
		static void pp1(int n){

//*   *
//** **
//*****
for(int i=1;i<=n;i++){//row
if(i!=n){
//star
for(int k=1;k<=i;k++){
System.out.print("*");
}
//space
for(int z=1;z<=2*(n-i)-1;z++){
System.out.print(" ");
}

//star
for(int k=1;k<=i;k++){
System.out.print("*");
}
System.out.println("");
}
else{
//last row
for(int j=1;j<=2*n-1;j++){
System.out.print("*");
}
System.out.println();
}
}

}

		static void pp2(int n){
//***
// ***
//  ***

for(int i=1;i<=n;i++){//row
//space
for(int j=1;j<=i-1;j++){
System.out.print(" ");
}
//star
for(int z=1;z<=n;z++){
System.out.print("*");
}
System.out.println("");
}
}
		static void pp3(int n){
//1
//23
//456

int cnt=1;
for(int i=1;i<=n;i++){//row
for(int j=1;j<=i;j++,cnt++){
System.out.print(cnt);
}
System.out.println("");
}
}
		static void pp4(int n){
//  1
// 2 3 
//  1

int mid=(n/2)+1;
for(int i=1;i<=n;i++){//row
if(i<=mid){
//upper--to--mid

//space 
for(int space=1;space<=mid-i;space++){
System.out.print(" ");
}

//num
int temp=i;
for(int k=1;k<=i;k++){

	System.out.print(temp+" ");
temp++;
}
}
else{
//below

//space 
for(int space=1;space<=i-mid;space++){
System.out.print(" ");
}
//num
int temp=n-i+1;
for(int k=1;k<=n-i+1;k++){

	System.out.print(temp+" ");
temp++;
}

}
System.out.println();


}
}
		static void pp5(int n){
//  +
// + + 
//  +

int mid=(n/2)+1;
for(int i=1;i<=n;i++){//row
if(i<=mid){
//upper--to--mid

//space 
for(int space=1;space<=mid-i;space++){
System.out.print(" ");
}

//+

for(int k=1;k<=i;k++){

	System.out.print("+ ");

}
}
else{
//below

//space 
for(int space=1;space<=i-mid;space++){
System.out.print(" ");
}
//+
for(int k=1;k<=n-i+1;k++){

	System.out.print("+ ");

}

}
System.out.println();


}
}


public static void main(String args[]){
int n=5;
	pp1(n);
	pp2(n);
	pp3(n);
	pp4(n);
	pp5(n);

}
}