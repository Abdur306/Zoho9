import java.util.*;
class L3Parking{
public static void main(String [] abu){


Vechile vech=new Vechile();
vech.met();
}
}
class Admin{
	static Scanner s1=new Scanner(System.in);
	static int fl;static int sl;
	public void show(){
		System.out.println("1.login || 2.");
		
		
		
	}
	public  void Login(){
		
		String username="Abdur";
		String userpass="Abu@306";
		System.out.println("Enter the Admin user id");
		String ustr=s1.next();
		System.out.println("Enter the Admin Pass id");
		String pstr=s1.next();
		if(ustr.equals(username) && pstr.equals(userpass)){
			System.out.println("Successfully");
			System.out.println("enter the Floor");
			 fl=s1.nextInt();
				System.out.println("enter the column");
             sl=s1.nextInt();
		}
		Vechile vsc=new Vechile();
		vsc.met();
	}
}
class Vechile extends Admin{ 
	static Scanner s2=new Scanner(System.in);
	String [][]Slot=new String[fl][sl];
	String Vechile_type[]=new String[5];
	int Vech_number[]=new int[5];
	String P_id[]=new String[5];
	int truck_slot=1;
	int bike_slot=2;
	int car_slot=2;
	String tick="PNR123.";
	static int k=0;
	public void met(){
       System.out.println("1.Admin || 2.Parking || 3.view");
        int in=s2.nextInt();
       switch(in){
      
	    case 1:
		   Admin ad=new Admin();
		   ad.Login();
		        break;
        case 2:
		        User us=new User();
				us.Parking();
		        break;
		case 3:
		
		        break;
	   }		   
	}
}
class User extends Vechile{
	static Scanner s3=new Scanner(System.in);
	public void Parking(){	
	System.out.println(" 1.Truck || 2.Car || 3.Bike || 4.Exist ");
    int ins=s3.nextInt();
     switch(ins){
		 
		 case 1:
		       Truck();
		       break;
		 case 2:
		       Car();
		       break;
		 case 3:
		      Bike();
		       break;
		case 4:
		      break;
			
	 }
	}
	
	public void Truck(){
    if(truck_slot>0){
		String genpast1="";
		String genpast2="";
	Vechile_type[k]="T";
	System.out.println("enter V.number");
	Vech_number[k]=s3.nextInt();
	for(int i=0;i<truck_slot;i++){
		for(int j=0;j<truck_slot;j++){
			Slot[i][j]="Truck";
			genpast1+=i;
			genpast2+=j;
			tick=tick+genpast1+genpast2;
			System.out.println(tick);
	      P_id[k]=	tick;
//System.out.println(P_id[k]);		  
		}
	}tick="";truck_slot--;k++;
	Parking();
	}else{
		System.out.println("Truck slot is full");
		Parking();
	}
	}
	
	public void Car(){
		System.out.println(car_slot);
		 if(car_slot>0){
		String genpasc1="";
		String genpasc2="";
	Vechile_type[k]="Car";
	System.out.println("enter V.number");
	Vech_number[k]=s3.nextInt();
	boolean res=true;
	for(int i=0;i<car_slot;i++){
		for(int j=i+1;j<=car_slot;j++){
			Slot[i][j]="C";
			genpasc1+=i;
			genpasc2+=j;
			tick=tick+genpasc1+genpasc2;
			System.out.println(tick);
	      P_id[k]=	tick;
              
		}
				
	}tick="";car_slot--;k++;
	Parking();
	}else{
		System.out.println("Truck slot is full");
	    Parking();
	}
	}

	public void Bike(){
		
	}
}

