import java.util.*;
import java.util.regex.*;
class L3Bank{
public static void main(String [] abu){

Bank iob=new Bank();
iob.AdorUse();
}
}
class Bank{
	static Scanner s=new Scanner(System.in);
static int Cusid[]=new int[10];
static int Accno[]=new int[10];
static String Name[]=new String[10];
static String Password[]=new String[10];
static String Encrypt[]=new String[10];
static int Balance[]=new int[10];


int cid=11;
int accno=11011;
int amt=10000;
int k=0;
static int index=4;

public void Initialize(){
	Cusid[0]=11;
	Accno[0]=11011;
	Name[0]="Kumar";
	Balance[0]=10000;
	Password[0]="ZohoM";
	Encrypt[0]="ApipN";
	
	
	Cusid[1]=22;
	Accno[1]=22022;
	Name[1]="Madhu";
	Balance[1]=20000;
	Password[1]="Banking";
	Encrypt[1]="Cboljoh";
	
	
	Cusid[2]=33;
	Accno[2]=33033;
	Name[2]="Rahul";
	Balance[2]=30000;
	Password[2]="campus";
	Encrypt[2]="dbnqvt";
	
	
	Cusid[3]=44;
	Accno[3]=44044;
	Name[3]="Robin";
	Balance[3]=40000;
	Password[3]="java11";
	Encrypt[3]="kbwb22";
	
}
public void AdorUse(){
System.out.println("1.Admin || 2.User");
int input=s.nextInt();
switch(input){
	case 1:
	      Admin ad=new Admin();
		  ad.Signin();
		   break;
    case 2:
         User use=new User();
		 use.Useropt();
	       break;
}
	
	
}
public void Display(){
	    Initialize();
        System.out.println("Cusid\t"+"AccNo\t"+"Name\t"+"Balance\t"+"Pass\t"+"Encrp\t  ");
      for(int i=0;i<index;i++){
        System.out.println(Cusid[i]+"\t"+Accno[i]+"\t"+Name[i]+"\t"+Balance[i]+"\t"+Password[i]+"\t  "+Encrypt[i]);	
	  }
	  AdorUse();
}


}
class Admin extends Bank{
	static Scanner s=new Scanner(System.in);
	
	public void Signin(){
		System.out.println("Enter the Admin-Name");
	String uname=s.next();
	System.out.println("Enter the Admin-Password");
	String upass=s.next();
	String name="Abdur";
	String pass="Abu@30";
	if((uname.equals(name))&& upass.equals(pass)){
		System.out.println("Admin logged succesfully");
		System.out.println("1.View || 2.Back\n");
		int in=s.nextInt();
		switch(in){
			case 1:
			 Display();
			    break;
			case 2:
			    AdorUse();
			     break;
		}
		
	}
	else{
		System.out.println("Re-enter valid pasword");
		Signin();
	}
	}
	
}
class User extends Bank{
	String Transtype[]=new String[10];
	int Transamt[]=new int[10];
	int Curbal[]=new int[10];
	int c=0;
public void Useropt(){
	System.out.println("1.New Customer || 2.Authentication || 3.MainMenu \n");
	int use=s.nextInt();
	switch(use){
	case 1:
         Addnew();
          break;
    case 2:
       Authentication();
         break;
    case 3:
         	AdorUse();
			break;
	}
	}
	
	public void Addnew(){
		Cusid[index]=cid*(index+1);
	Accno[index]=accno*(index+1);
		System.out.println("enter New Customer Name");
	Name[index]=s.next();
	Balance[index]=amt;
	System.out.println("Password should contians each smallalpha,bigalpha,numbers,sp.chars .Password have 6-10 chars");
	System.out.println("enter password");
	String pwd=s.next();
	if(validation(pwd)){
		System.out.println("Re-enter password ");
		String pwd2=s.next();
			if(pwd.equals(pwd2)){
    System.out.println(" Password Matched \n");
        Password[index]=pwd2;
		Encrypt[index]=Encryptpass(pwd2);
		System.out.println("Signedup Successfully");
		System.out.println("Cusid\t"+"Accno\t"+"Name\t"+"Balance\t"+"Encrypass\t");
		System.out.println(Cusid[index]+"\t"+Accno[index]+"\t"+Name[index]+"\t"+Balance[index]+"\t"+Encrypt[index]+"\t");
		Transtype[c]="Openings";
		Transamt[c]=Balance[index];
		Curbal[c]=Balance[index];
		index++;
		c++;
		Useropt();
			}
		else{
        System.out.println(" password");
        Addnew();
			}
		}else{
			System.out.println("password 6-10 characters");
			Addnew();
		}
	}
	
		public boolean validation(String p1){
			boolean var;
			String pass="^(?=.*[0-9])"+"(?=.*[a-z])"+"(?=.*[A-Z])"+"(?=.*[!@#$%&])"+"(?=\\S+$).{6,10}";
			Pattern p=Pattern.compile(pass);
			Matcher m=p.matcher(p1);
			var=m.matches();
			return var;
		}
		private String Encryptpass(String str){
	String temp="";
	for(int i=0;i<str.length();i++){
		temp+=(char)(str.charAt(i)+1);
	}
	return temp;
}
	
	public void Authentication(){
		System.out.println("Sign in");
		System.out.println("Enter the id");
		int id1=s.nextInt();
		System.out.println("Enter the Password");
		String pas1=s.next();
		for(int i=0;i<index;i++){
			if(id1==Cusid[i] && pas1.equals(Password[i])){
				System.out.println("Login succesfully \n");
			System.out.println("Name : "+Name[i]+"  AccNo : "+Accno[i]+"  Balance : "+Balance[i]+"\n");
				Operations();
			}
			else if(id1!=Cusid[i] && !pas1.equals(Password[i]))
				continue;
			
			else{
				System.out.println("No Record FOund");
			Authentication();
			}
		}
		}
		public void Operations(){
			System.out.println("1.Withdraw || 2.Deposit || 3.Transfer || 4.ChangePassword || 5.ShowHistory || 6.MainMenu \n");
			int o=s.nextInt();
			switch(o){
			 case 1:
                Withdraw(index);
                  break;

			 case 2:
                   Deposit(index);
                  break;

			 case 3:
                  Transfer(index);
                  break;

			 case 4:
                   ChangePwd(index);
                  break;

			 case 5:
                 Showhistory(index);
                  break;

			 case 6:
                  AdorUse();
                  break;				  
				
			
			}
			
			}
private void Withdraw(int iw){
				
	System.out.println("Enter amt to withdraw");
	int withAmt=s.nextInt();
	int varw=iw-1;
	if(Balance[varw]>=1000){
	   System.out.println("Withdraw Successfully");
	   Balance[varw]-=withAmt;
	 
	    Transtype[c]="Withdraw";
		Transamt[c]=withAmt;
		Curbal[c]=Balance[varw];
		c++;
	}
	else{
		System.out.println(" initial balance 1000 can't able to withdraw");
	}
	Operations();
			}
private void Deposit(int id){
				
	System.out.println("Enter amt to Deposit");
	int depAmt=s.nextInt();
	int vard=id-1;
	System.out.println("Deposited  Successfully");
	Balance[vard]+=depAmt;
	    Transtype[c]="Deposit";
		Transamt[c]=depAmt;
		Curbal[c]=Balance[vard];
		c++;			
		Operations();
			}
private void Transfer(int it){
				
	System.out.println("Enter Transfer Account Number ");
	int uacc=s.nextInt();
	System.out.println("Enter amt to Amount");
	int tamt=s.nextInt();
	int vart=it-1;
	Balance[vart]-=tamt;
	    Transtype[c]="Transfer";
		Transamt[c]=tamt;
		Curbal[c]=Balance[vart];
		c++;
	for(int i=0;i<it;i++){
		if(uacc==Accno[i]){
			Balance[i]+=tamt;
	System.out.println("Transfer Successfully");
	//System.out.println(Cusid[i]+"\t"+Accno[i]+"\t"+Name[i]+"\t"+Balance[i]+"\t");
			break;
	}
	}
	//System.out.println("Cusid\t"+"AccNo\t"+"Name\t"+"Balance\t");
	//System.out.println(Cusid[vart]+"\t"+Accno[vart]+"\t"+Name[vart]+"\t"+Balance[vart]+"\t");
	Operations();
				
			}
private void Showhistory(int sh){
				System.out.println("Transtype\t"+"Transamt\t"+"Curbalance\t");
				for(int i=0;i<c;i++){
				System.out.println(Transtype[i]+"\t"+"\t"+Transamt[i]+"\t"+"\t"+Curbal[i]+"\t");	
				}
				Operations();
				
			}
private void ChangePwd(int cpwd){
				
				Operations();
			}
	
	
}