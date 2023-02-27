import java.util.*;
class L3Park{
public static void main(String [] abu){

Admin ad=new Admin();
ad.Login();
}
}
class Admin{
	static Scanner s1=new Scanner(System.in);
	static int fl;static int sl;
	public void show(){
		System.out.println("1.login || 2.");
		
	}
	public  void Login(){
		
		/*String username="Abdur";
		String userpass="Abu@306";
		System.out.println("Enter the Admin user id");
		String ustr=s1.next();
		System.out.println("Enter the Admin Pass id");
		String pstr=s1.next();
		if(ustr.equals(username) && pstr.equals(userpass)){
			System.out.println("Successfully");*/
			System.out.println("enter the Floor");
			 fl=s1.nextInt();
				System.out.println("enter the column");
             sl=s1.nextInt();
		}
		Parking vsc=new Parking();
		vsc.met();
	}
	
}
class Parking extends Admin{
	static Scanner s2=new Scanner(System.in);
	char [][]Slot=new char[fl][sl];
	char Vechile_type[]=new char[5];
	int Vech_number[]=new int[5];
	String T_id[]=new String[5];
	int truck_slot=1;
	int bike_slot=2;
	//int car_slot=2;
	String tick="PNR123_";
	static int k=0;
	
	

	
	public void met(){
		
       System.out.println(" 1.Parking || 2. view");
        int in=s2.nextInt();
       switch(in){
      
	    case 1:
		        park();
		        break;
        case 2:
		        display();
		        break;
		case 3:
		
		        break;
	   }		   
	}
	public void park(){
		
		System.out.println("Enter the Vechile type");
		char c1=s2.next().charAt(0);
		
		System.out.println("Enter the Vechile Number");
		Vech_number[k]=s2.nextInt();
		for(int i=0;i<fl;i++){
			for(int j=0;j<sl;j++){
			if()	
				
				
			}
		}
		
		
		
		
	}
	public void display(){
		for(int i=0;i<fl;i++){
			for(int j=0;j<sl;j++){
				
			Slot[i][j]='E'; 
         System.out.print(Slot[i][j]);			
			}
			System.out.println();
		}
	}
		
}


	
	
	
	
	
