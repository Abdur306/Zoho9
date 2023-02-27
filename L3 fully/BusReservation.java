import java.util.*;
class BusReservation{
public static void main(String [] abu){


Execute exe=new Execute();
exe.met();
}
}
class Execute extends Admin{
	
	public void met(){
		Scanner s3=new Scanner(System.in);
	System.out.println("1.Admin || 2.User ");
	int usein=s3.nextInt();
	switch(usein){
		case 1:
		      AdLogin();
			  break;
		case 2:
		   Reservation res=new Reservation();
		       res.MainReserve();
			   break;
	}
	}
	
}
class Admin {
	static Scanner s1=new Scanner(System.in);
	//static Details bus[]=new Details[10];
	 static String Seater[][]=new String[seat][col];
	 static String Sleeper[][]=new String[sleep][col];
	 static int seat;
	  static int col;
	 static int sleep;
	static int tseat=seat*col;
	static int tsleep=sleep*col;
	static int ks=0;
	static int kslp=0;
	
	 public void AdLogin(){		 
		String u_name="Abdur";
		String u_pass="Abu@306";
		System.out.println("Enter Username");
		String u_in=s1.next();
		System.out.println("Enter Password");
		String p_in=s1.next();
		if(u_in.equals(u_name) && p_in.equals(u_pass)){
			System.out.println("Admin Login Successfull");
			System.out.println("Enter the Seat(row) size");
			seat=s1.nextInt();
			System.out.println("Enter the Berth(row) size");
			sleep=s1.nextInt();
			System.out.println("Enter the Column size");
			col=s1.nextInt();
			Adaction();
		}
		else{
			System.out.println("Re-enter Username & Password");
			AdLogin();
		}
		}
	private void Adaction(){
		System.out.println("1.view || 2.MainMenu");
		 Reservation rs=new Reservation();
		int in=s1.nextInt();
		switch(in){
			
		case 1:
		     rs.Display1();
			  break;
		case 2:
		    
             rs.MainReserve();			 
			  break;
		}
	}
	/*public  void Display(){
		System.out.println("Seater Seats");
		for(int i=0;i<ks;i++){
			for(int j=0;j<col;j++){
				
				System.out.print(Seater[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sleeper Seats");
		for(int i=0;i<kslp;i++){
			for(int j=0;j<sleep;j++){
				
				System.out.print(Seater[i][j]+" ");
			}
			System.out.println();
		}
		Adaction();
	}*/
	
}
class Details{
	String name;
	int age;
	String gender;
	String phone;
	String mailid;
	String pickup;
	String drop;
	String seatno;
public Details(String name,int age,String gender,String phone,String mailid,String pickup,String drop,String seatno){
	 this.name=name;
	 this.age=age;
	 this.gender=gender;
	 this.phone=phone;
	 this.mailid=mailid;
	 this.pickup=pickup;
	 this.drop=drop;
	 this.seatno=seatno;
}
public String toString(){
	return name+" "+age+" "+gender+" "+phone+" "+mailid+" "+pickup+" "+drop+" "+seatno;
}
	
	
}
class Reservation extends Admin{
	
	static Scanner s2=new Scanner(System.in);
	ArrayList<Details>arr=new ArrayList<>();
	
	public void MainReserve(){
	System.out.println("1.Availabilities || 2.Book || 3.Cancel || 4.view");	
		int input=s2.nextInt();
		switch(input){
			
			case 1:
			      Available();
				  break;
			case 2:
			     Book();
			     break;
			case 3:
			    Cancel();
				break;
			case 4:
			    Display1();
				break;
			
		}
	}
	public void Available(){
		Admin ad=new Admin();
		int inc=1;
		System.out.println(seat);
			System.out.println(sleep);
		System.out.println("Available Seater Seats");
		for(int i=0;i<seat;i++){
			for(int j=0;j<col;j++){
				Seater[i][j]=String.valueOf(inc++);	
				System.out.print(Seater[i][j]+" ");
			}
			System.out.println();
		}inc=1;
		System.out.println("Available Sleepers berth");
		for(int i=0;i<sleep;i++){
			for(int j=0;j<col;j++){
				Sleeper[i][j]=String.valueOf(inc++);	
     System.out.print(Sleeper[i][j]+"U ");				
			}
			System.out.println();
		}
		MainReserve();
	}
	protected void Book(){
		
		System.out.println("Enter name ");
		String cname=s2.next();
		System.out.println("Enter age ");
		int cage=s2.nextInt();
		System.out.println("Enter gender ");
		String cgender=s2.next();
		System.out.println("Enter phone number ");
		String cnum=s2.next();
		System.out.println("Enter mialid ");
		String cmail=s2.next();
		System.out.println("Enter Pickup ");
		String cpickup=s2.next();
		System.out.println("Enter Drop ");
		String cdrop=s2.next();
		System.out.println("1.Seater || 2. Sleeper");
		int bok=s2.nextInt();
		if(bok==1){
			//int tseat=seat*col;
			if(tseat>0){
				System.out.println(tseat);
				System.out.println("Enter Seat No");
				String seat_sno=s2.next();
				boolean result=true;
				for(int i=0;i<seat;i++){
				for(int j=0;j<col;j++){
				//	System.out.println(Seater[i][j]);
				if(String.valueOf(seat_sno).equals(Seater[i][j])){
				System.out.println("Seater Ticket Booked success");
                 Seater[i][j]=" ";
				 arr.add(ks++,new Details(cname,cage,cgender,cnum,cmail,cpickup,cdrop,seat_sno));
			    result=false;
				 tseat--;
				 break;
				}
				}
				}
			  if(result){
              System.out.println("Re-Enter valid Seat No");
			  Book();
				}
				
           MainReserve();				
			}
			else{
				System.out.println("Currently no tickets ");
			}
			
		}
		else if(bok==2){
			//int tsleep=sleep*col;
			if(tsleep>0){
				System.out.println(tsleep);
				System.out.println("Enter Sleeper Seat No");
				String sleep_sno=s2.next();
				for(int i=0;i<sleep;i++){
				for(int j=0;j<col;j++){
				if(sleep_sno.equals(Sleeper[i][j])){
				System.out.println("Sleeper Ticket Booked success");
                 Seater[i][j]=" ";
				 arr.add(kslp++,new Details(cname,cage,cgender,cnum,cmail,cpickup,cdrop,sleep_sno));
				 tsleep--;
				 break;
				}else{
              System.out.println("Re-Enter valid Seat No");
			  Book();
				}
				}
				}
           MainReserve();				
			}
			else{
				System.out.println("Currently no tickets ");
			}
			
			
		}
	}
	protected void Cancel(){
		
	}
	public  void Display1(){
		System.out.println("Seater Seats");
		for(int i=0;i<ks;i++){
			for(int j=0;j<col;j++){
				
				System.out.print(Seater[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sleeper Seats");
		for(int i=0;i<kslp;i++){
			for(int j=0;j<sleep;j++){
				
				System.out.print(Seater[i][j]+" ");
			}
			System.out.println();
		}
		MainReserve();
	}
	
}