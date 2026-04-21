class Task_1_P_E{

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
	int noOfTimes=Integer.parseInt(args[1]);
	int num=Integer.parseInt(args[0]);
	long rec_tt=0,it_tt=0,st,et,ans1=0,ans2=0;
	float rec_avg,it_avg;
 
//rec
	for(int i=0;i<noOfTimes;i++){
		st=System.nanoTime();
		 ans1=recursiveFact(num);
		et=System.nanoTime();
		rec_tt+=et-st;
		
		}
		rec_avg=(float)rec_tt/noOfTimes;
	
//iteration
	for(int i=0;i<noOfTimes;i++)
	{	st=System.nanoTime();
		 ans2=iterativeFact(num);
		et=System.nanoTime();
		it_tt+=et-st;
		}
		it_avg=(float)it_tt/noOfTimes; 


        if (ans1 == -1 || ans2 == -1)
            System.out.println("Negative fact not possible");
        else {
            System.out.println("recursiveFact: " + ans1);
            System.out.println("iterativeFact: " + ans2);
        }

	
	 System.out.println("Recursive Avg Time: " + rec_avg + " ns");
         System.out.println("Iterative Avg Time: " + it_avg + " ns");


	}
}