class PerformanceEvaluator{
//By iteration
static void s1(){
for(int i=0;i<30;i++){
	System.out.println(3000000);
		}
}				
//By manually
static void s2(){
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	System.out.println(3000000);
	
		}
public static void main(String[] args){
	int noOfTimes=Integer.parseInt(args[0]);
	long s1_tt=0,s2_tt=0,st,et;
	float s1_avg,s2_avg;
	//s2 testing 
	for(int i=0;i<noOfTimes;i++){
	st=System.currentTimeMillis();
	s2();
	et=System.currentTimeMillis();
	s2_tt+=et-st;
	
	}
	s2_avg=(float)s2_tt/noOfTimes; 
	//s1 testing
	for(int i=0;i<noOfTimes;i++){
	st=System.currentTimeMillis();
	s1();
	et=System.currentTimeMillis();
	s1_tt+=et-st;

	} 
	s1_avg=(float)s1_tt/noOfTimes;
	
	System.out.println(s1_avg);
	System.out.println(s2_avg);

	}
}