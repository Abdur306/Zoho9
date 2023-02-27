import java.util.*;
class BankingApplication{
static int custId[]=new int[10];
static int AccountNo[]=new int[10];
static String Name[]=new String[10];
static int Balance[]=new int[10];
static String password[]=new String[10];
static String Encrypt[]=new String[10];
static Scanner s=new Scanner(System.in);
public static void main(String [] abu){
	
show();
}
public static void show(){
	
Admin ad=new Admin();
Users use=new Users();
System.out.println("1.Admin | 2.User | 3.exit");
int n=s.nextInt();
switch(n){
	case 1:
	      ad.view1();
		  break;
    case 2:
        use.view2();
          break;
    case 3:
           
           break;	

}	
}
}

class Users extends BankingApplication{
static Scanner s=new Scanner(System.in);

int customerid=11;
int accountnum=11011;
static int t=4;
static int ini=0;
public static void view2(){
	
//Users bc=new Users();

System.out.println("1.Initialize | 2.Add Customer  | 3. Authentication | 4.exit");
int n=s.nextInt();
switch( n){
	case 1:
	     initialize();
		  break;
    case 2:
          Add_customer();
          break;
    case 3:
          Authentication();
           break;
    
	case 4:
          show();
		  break;	

}	
}

public static void initialize(){
		Admin ad=new Admin();
	custId[0]=11;
	 AccountNo[0]=11011;
	Name[0]="Kumar";
	 Balance[0]=10000;
	 Encrypt[0]="ApipNbjm";
	
	custId[1]=22;
	 AccountNo[1]=22022;
	Name[1]="Madhu";
	 Balance[1]=20000;
	 Encrypt[1]="Cboljoh";
	
	custId[2]=33;
	 AccountNo[2]=33033;
	Name[2]="Rahul";
	 Balance[2]=30000;
	 Encrypt[2]="dbnvt";
	
	custId[3]=44;
	 AccountNo[3]=44044;
	Name[3]="Robin";
	 Balance[3]=40000;
	 Encrypt[3]="kbwb22";
	System.out.println("custId\t"+"Acc.No\t"+"Name\t"+"Balance\t"+"En_Pwd\t");
	for(int i=0;i<4;i++){
		System.out.println(custId[i]+"\t"+ AccountNo[i]+"\t"+Name[i]+"\t"+ Balance[i]+"\t"+Encrypt[i]+"\t");
	}
	//ad.Display();
	view2();
}

public static void Add_customer(){
     int begin=1; 
	custId[t]=11*(t+begin);
	 AccountNo[t]= 11011*(t+begin);
	Name[t]=s.next();
	Balance[t]=10000;
	password[t]=s.next();
    Encrypt[t]=Encryptpass(password[t]);
	t++;
	//ini++;
	Full_display();
}
public static void Full_display(){
	System.out.println("custId\t"+"Acc_No\t"+"Name\t"+"Balance\t"+"En_Pwd\t");
	for(int i=0;i<t;i++){
		System.out.println(custId[i]+"\t"+AccountNo[i]+"\t"+Name[i]+"\t"+Balance[i]+"\t"+ Encrypt[i]+"\t");
	}
	
     view2();
}
public static String Encryptpass(String str){
	
	String temp="";
	for(int i=0;i<str.length();i++){
		temp+=(char)(str.charAt(i)+1);
	}
	return temp;
	}
	public static void Authentication(){
		System.out.println("Enter the UserName");
		String uname=s.next();
		System.out.println("Enter the Password");
		String pass=s.next();
		boolean a=true;
		for(int i=0;i<t;i++){
			if((uname.equals(Name[i]))&&(pass.equals(password[i])))
			{
				a=false;
			System.out.println("YOU HAVE LOGGED-IN SUCCESSFULLY"); 
			Basic_operations();
			}
	
		}
		if(a)
		{
			System.out.println("Invalid input ");
			Authentication();
		}
		 
		}
		public static void atm_Withdraw(){
			
		}
		public static void cash_Deposit(){
			
			
		}
		public static void account_Transfer(){
			
			
		}
	public static void Basic_operations(){
		System.out.println("1.Atm WithDrawal | 2.Cash Deposit | 3.Account Transfer | 4.Exit");
		int chose=s.nextInt();
		switch(chose){
			case 1:
			    atm_Withdraw();				 
			    break;
			case 2:
			    cash_Deposit();
			    break;
		    case 3:
			    account_Transfer();
			    break;
			case 4:
			     view2();
				 break;
			}
		
		
		
		
	}
}
class Admin extends Users{
	//Users bc=new Users();
	static Scanner s1=new Scanner(System.in);
	public static void view1(){
		
	BankingApplication ba=new BankingApplication();
	System.out.println("1.View | 2.Exit");
	int get=s1.nextInt();
	switch(get){
		case 1:
		     Display();
			 break;
		case 2:
		     ba.show();
		      break;
	}
	
	}
	public static void Display(){
	view1();
		
	}
}

	
	
	 

		
		
	
	




