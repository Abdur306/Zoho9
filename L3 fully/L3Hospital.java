import java.util.*;
 class L3Hospital{
static Scanner s=new Scanner(System.in);
static int id[]=new int[1];
static String []name=new String[1];
static int in_time[] =new int[1];
int val=-1;

public static void main(String [] abu){
//System.out.println("how many patients");
int p=0;
do{
System.out.println("press 1.New Patient | 2.old Patient");
 p=s.nextInt();
switch(p){
	case 1:
	  System.out.println("enter name,in-time");
	  register();
	  break;
	  
	  case 2:
	   //static int value= 
	   regular_patient();
	  // if(value!=-1){
		
	  //break;
	//}
	//else{
		//System.out.println("no records founds");
		//break;
	    //}
}
}while(p!=3);
}
static void register(){
	for(int i=0;i<name.length;++i){
		id[i]=(681+i);
		name[i]=s.next();
		in_time[i]=s.nextInt();	
	}
	   System.out.println("id \t"+"name \t"+"in-time \t");
	for(int i=0;i<name.length;++i)
		System.out.println(id[i]+" \t"+ name[i]+" \t" +in_time[i]+" \t");
	}
	
	static void regular_patient(){
	  System.out.println("enter id & name");
	  int p_id=s.nextInt();
	  String p_name=s.next();
	   for(int i=0;i<id.length;i++){
		   if(p_id==(id[i]) && p_name==(name[i])){
			   System.out.println("enter the in-time");
			   in_time[i]=s.nextInt();
			  //val=i;
			   //return val;
			   break;
		   }
		   else{
			   System.out.println("No records found");
		   }
	    }
    }
 }
 
 
   	
