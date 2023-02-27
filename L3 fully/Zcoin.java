import java.util.*;
import java.util.regex.*;
class Zcoin{
public static void main(String [] abu){
	
Crpto_Zc zc=new Crpto_Zc();
zc.Show();
}
}
class Crpto_Zc{
	static String W_Name[]=new String[10];
	static String W_Email[]=new String[10];
	static int W_Mobile[]=new int[10];
	static int W_H_id[]=new int[10];
	static String W_Password[]=new String[10];
	static int W_Deposit[]=new int[10];
	
	
	
	static String Name[]=new String[10];
	static String Email[]=new String[10];
	static int Mobile[]=new int[10];
	static int H_id[]=new int[10];
	static String Password[]=new String[10];
	static int Deposit[]=new int[10];
	static int Zid[]=new int[10];
	
	static int zid=999;
   static  int k=0;
	static Scanner s=new Scanner(System.in);
	public void Show(){
		System.out.println("1.Admin Login || 2.Create Account || 3. User Login || 3.Main Menu");
		int in=s.nextInt();
		switch(in){
		    
			case 1:
			Admin ad=new Admin();
			     ad.Adlogin();
		         // Signup();
				  break;
		    case 2:
			     Signup();
				 break;
			case 3:
			     Uslogin();
			     break;
		}
	}
	public void Signup(){
		System.out.println("Enter the Name");
		W_Name[k]=s.next();
		System.out.println("Enter the Emai-ld");
		W_Email[k]=s.next();
		System.out.println("Enter the Mobile");
		W_Mobile[k]=s.nextInt();
		System.out.println("Enter the H_id");
		W_H_id[k]=s.nextInt();
		 System.out.println("Enter the Deposit");
		 W_Deposit[k]=s.nextInt();
		 Password(W_Name[k],W_Email[k],W_Mobile[k],W_H_id[k],W_Deposit[k]);
	}
		 
		private void Password(String wN,String wE,int wMob,int wHid,int Wdepo){
			
		System.out.println("Enter the Password . It contians 8 digits with (a-z,A-Z,1-9,spl chars)");
		String ps=s.next();
		if(Validate(ps)){
		 System.out.println("Validate successfull");
			 W_Password[k]=ps;
			 k++;
		     System.out.println("Signup Successfully");
		     Show();
		}
		else{
			System.out.println("Re-enter Details");
			Password( wN,wE, wMob, wHid, Wdepo);
		}
		}
		
	
	public boolean Validate(String pass){
 	 String spass="^(?=.*[A-Z])+(?=.*[a-z])+(?=.*[!@#$%&*])+(?=.*[0-9])+(?=[\\S+$]).{8,20}$";
	 Pattern p=Pattern.compile(spass);
	 Matcher m=p.matcher(pass);
	 boolean var=m.matches();
	 return var;
    }
	
	private void Uslogin(){
		System.out.println("Enter the Zid");
		int Uzid=s.nextInt();
		System.out.println("Enter the ZPassword");
		String Uzpass=s.next();
		boolean result=true;
		for(int i=0;i<Zid.length;i++) {
			if(Uzid==Zid[i] && Uzpass.equals(Password[i])) {
				result=false;
				System.out.println("Successfully login");
			}	
			}
		if(result) {
			System.out.println("Re-enter id & password");
			Uslogin();
		}
	}
}
class Admin extends  Crpto_Zc{
	static Scanner s1=new Scanner(System.in);
	public  void Adlogin(){
		
		String uname="Abdur";
		String pass="Abdur@306";
	System.out.println("enter the Admin USername");
	String A_usern=s1.next();
	System.out.println("enter the Admin Password");
	String A_pass=s1.next();
	if(A_usern.equals(uname)&&A_pass.equals(pass)){
		System.out.println("Admin Login Successfully");
		Admin_roll();
		}
		else{
			System.out.println("Invalid ! Re-enter !");
			Adlogin();
		}
	}
	public void Admin_roll(){
		System.out.println("1.view || 2.Operations || 4.Back ");
		int swt=s1.nextInt();
		switch(swt){
			case 1:
			    Ad_show();
				 break;
		    case 2:
		    	Ad_Operations();
				 break;
			case 3:
				Show();
				  break;
		}
		}
	
	private void Ad_show(){
		
		System.out.println("Wait.no\t  mail-id\t Password \t");
		for(int i=0;i<k;i++){
			System.out.println(i+"\t"+W_Email[i]+"\t"+W_Password[i]+"\t");	
		}Admin_roll();	}	
	
	private void Ad_Operations(){
		int ini=0;
		int st=0;
		System.out.println("Enter W.no ");
		int adallow=s1.nextInt();
         for(int i=0;i<k;i++) {
        	 if(adallow==i)
        	    ini=i;
        	 }
         System.out.println("1.Approval || 2.Rejection");
         int ar=s1.nextInt();
         if(ar==1) {
		for(int i=ini;i<=ini;i++){
			Zid[st]=++zid;
			Name[st]=W_Name[i];
			Email[st]=W_Email[i];
			 Mobile[st]=W_Mobile[i];
			 H_id[st]=W_H_id[i];
			 Password[st]=W_Password[i];
			 Deposit[st]=W_Deposit[i];
			 W_Name[i]="Null";W_Email[i]="Null";W_Mobile[i]=0;
			 W_H_id[i]=0;W_Password[i]="Null";W_Deposit[i]=0;
			 
			 System.out.println("Admin Approved.User can signin");
			 
			System.out.println(Name[st]+"\t"+Mobile[st]+"\t"+Email[st]+"\t");
			
			System.out.println("deleted frm temp Array");
			
			System.out.println(W_Name[i]+"\t"+W_Mobile[i]+"\t"+W_Email[i]+"\t");
			}
         }else if(ar==2) {
        	 
        	 for(int i=ini;i<=ini;i++){
        		 
     			 W_Name[i]="Null";W_Email[i]="Null";W_Mobile[i]=0;
     			 W_H_id[i]=0;W_Password[i]="Null";W_Deposit[i]=0;
     			 
     			 System.out.println("Admin Rejected your Signup");
     			System.out.println(W_Name[i]+"\t"+W_Mobile[i]+"\t"+W_Email[i]+"\t");
     			}
         }Admin_roll(); }
         
	
}