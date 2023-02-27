import java.util.Scanner;

public class Rbooking {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		TicketsBooker tkb=new TicketsBooker();
		int n;//=s.nextInt();
		do{
		System.out.println("1.Bookings | 2.Cancelation | 3.Chat | 4.Exist");
		 n=s.nextInt();
		switch(n){
			case 1:
			 
				 System.out.println("enter the passenger name,age,birth_preference");
				 String p_name=s.next();
				 int p_age=s.nextInt();
				 String p_birth_preference=s.next();
				 tkb.Bookticket(p_name, p_age, p_birth_preference);
				 //(name,age,birth_preference);
				  break;
			case 2:
		         System.out.println("enter the passenger id");

		         break;
		    case 3:
			    System.out.println("chat prepared");
				
				break;
				
			case 4:
			     System.out.println("thank you visit again");
		}
		}while(n!=4);
		}
}
//		
//        class Passenger{
//			int id=1;
//			String p_name;
//			int p_age;
//			String  p_birth_preference;
//			//String alloted;
//     	//	int number;
//		//	int pref;
//			public Passenger(String  p_name,int p_age,String p_birth_preference){
//			this.p_name=p_name;
//			this.p_age=p_age;
//			this.  p_birth_preference=  p_birth_preference;
//			this.id=id++;
//			//alloted="";
//			//pref=0;
//			//number=-1;
//			
//			}
//       }
       
		
  class TicketsBooker{
			
    int []tickets=new int[7];           
//			 int [] lower_birth= new int [3];
//			 int [] meddile_birth=new int[3];
//	         int [] upper_birth=new int[3];
//		   	 int [] rac=new int[2];
//			 int [] w_list=new int[2];
//			 
			 //book tickets
			
			public   void Bookticket(String p_name,int p_age,String p_birth_preference){
			TicketsBooker tks=new TicketsBooker();
			for(int i=1;i<=tickets.length;++i) {
				  if((p_birth_preference.equals("L") && tickets[i]<=2 )||
				           (p_birth_preference.equals("M") && tickets[i] <=4) ||
				           (p_birth_preference.equals("U") && tickets[i] <=6))
				        
				            System.out.println("Preferred Berth Available");
				            if(p_birth_preference.equals("L"))
				            {
                            System.out.println("L");
                            
                            }
				            else  if(p_birth_preference.equals("M"))
				            {
                            System.out.println("M");
                            }
				            if(p_birth_preference.equals("U"))
				            {
                            System.out.println("U");
                            }
			
		
			}
			}
		//	public  void initial_tickets() {
			//	 int [] lower_birth= new int [3];
				
				// int [] meddile_birth=new int[3];
		         //int [] upper_birth=new int[3];
			   	 //int [] rac=new int[3];
				 //int [] w_list=new int[3];
			}
  
		class Cancel{
			
		}