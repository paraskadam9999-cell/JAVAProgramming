class Task_1{
static long recursiveFact(int num){
if(num<0) return -1;
if(num==0) return 1;
return num*recursiveFact(num-1);
}

static long iterativeFact(int num){
if(num<0) return -1;
long fact=1;
for(int i=1;i<=num;i++){
fact*=i;
}
return fact;

}

public static void main(String[] args)
{
int num=Integer.parseInt(args[0]);
long ans1=recursiveFact(num);
long ans2=iterativeFact(num);

if(ans1==-1) System.out.println("Negative fact not possible");
else System.out.println("recursiveFact: "+ans1);

if(ans2==-1) System.out.println("Negative fact not possible");
else System.out.println("iterativeFact: "+ans2);
}

}