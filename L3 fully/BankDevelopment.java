import java.util.*;
class BankDevelopment{
public static void main(String [] abu){

Bank iob=new Bank();
System.out.println("\n Welcome to Indian Overseas Bank \n");
iob.MainMenu();
}
}
class Bank{
static Scanner s=new Scanner(System.in);	
int Cusid[]=new int[10];
int Accno[]=new int[10];
String Name[]=new String[10];
String Password[]=new String[10];
String Encrypt[]=new String[10];
int Balance[]=new int[10];

int cid=11;
int accno=11011;
int amt=10000;
int k=0;
int index=4;

public void MainMenu(){
	
	System.out.println("\n 1.Initial || 2.Add Customer || 3.Display || 4.Authentication\n");
	int in=s.nextInt();
	switch(in){
		case 1:
		       Initialize();
		        break;
		case 2:
		       AddCustomer();
		        break;
		case 3:
		       Display();
		        break;
		case 4:
		      Authentication();
			   break;
			
	}

}

private void Initialize(){
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
	
        System.out.println("Cusid\t"+"AccNo\t"+"Name\t"+"Balance\t"+"Pass\t"+"Encrp\t  ");
      for(int i=0;i<4;i++){
        System.out.println(Cusid[i]+"\t"+Accno[i]+"\t"+Name[i]+"\t"+Balance[i]+"\t"+Password[i]+"\t  "+Encrypt[i]+"   ");	
	  }
  MainMenu();
	
}
protected void AddCustomer(){
	Cusid[index]=cid*(index+1);
	Accno[index]=accno*(index+1);
	System.out.println("Enter the Name");
	Name[index]=s.next();
	Balance[index]=amt;
	System.out.println("Enter the Password");
	Password[index]=s.next();
	Encrypt[index]=Encryptpass(Password[index]);
	
	index++;
	
	MainMenu();
}
private void Display(){
        System.out.println("Cusid\t"+"AccNo\t"+"Name\t"+"Balance\t"+"Pass\t"+"Encrp\t  ");
      for(int i=0;i<index;i++){
        System.out.println(Cusid[i]+"\t"+Accno[i]+"\t"+Name[i]+"\t"+Balance[i]+"\t"+Password[i]+"\t  "+Encrypt[i]+"  ");	
	  }
	  MainMenu();
}
private String Encryptpass(String str){
	String temp="";
	for(int i=0;i<str.length();i++){
		temp+=(char)(str.charAt(i)+1);
	}
	return temp;
}
private void Authentication(){
	System.out.println("Enter the Account holder name");
	String n=s.next();
	System.out.println("Enter the cusid number");
	int u_cusid=s.nextInt();
	System.out.println("Enter the AccountNo");
	int u_accno=s.nextInt();
	boolean result=true;
	for(int i=0;i<Cusid.length;i++){
		if((u_cusid==Cusid[i]) && (u_accno==Accno[i]) && (n.equals(Name[i]))){
			result=false;
			int Savings=Balance[(u_cusid%10)-1];
			System.out.println(n+"  LOGGEDIN SUCCESSFULLY \n");
			System.out.println("Account holder name : "+n+"\t Accountno : "+u_cusid+"\t "+"AccBalance : "+Savings+"\n");
			System.out.println("1.Cash Withdraw || 2.Cash Deposit || 3.Account Transfer || 4.Display");
		int re=s.nextInt();
		switch(re){
			case 1:
			Withdraw(u_cusid);
			       break;
			case 2:
			Deposit(u_cusid);
			       break;
			case 3:
			Transfer(u_cusid);
			     break;
		    case 4:
			    Display();
				break;
		
		}
		}
	}
	if(result){
		System.out.println("Invalid Name or Cardnumber or Pin ");
		Authentication();
	}
}
	

private void Withdraw(int u_pinw ){
	
	System.out.println("Enter amt to withdraw");
	int withAmt=s.nextInt();
	int varw=(u_pinw%10)-1;
	if(Balance[varw]>=1000){
	Balance[varw]-=withAmt;
	System.out.println("Current balance = "+Balance[varw]);
	
	System.out.println("Cusid\t"+"AccNo\t"+"Name\t"+"Balance\t");
	System.out.println(Cusid[varw]+"\t"+Accno[varw]+"\t"+Name[varw]+"\t"+Balance[varw]+"\t");
	}
	else{
		System.out.println(" initial balance 1000 can't able to withdraw");
	}
	
}
private void Deposit(int u_pind){
	
	System.out.println("Enter amt to Deposit");
	int depAmt=s.nextInt();
	int vard=(u_pind%10)-1;
	Balance[vard]+=depAmt;
	System.out.println("Cusid\t"+"AccNo\t"+"Name\t"+"Balance\t");
	System.out.println(Cusid[vard]+"\t"+Accno[vard]+"\t"+Name[vard]+"\t"+Balance[vard]+"\t");
	
}
private void Transfer(int u_pint){
	System.out.println("Enter amt to AccNo");
int uacc=s.nextInt();
System.out.println("Enter amt to Amount");
int tamt=s.nextInt();
int vart=(u_pint%10)-1;
Balance[vart]-=tamt;
for(int i=0;i<Accno.length;i++){
	if(uacc==Accno[i]){
		Balance[i]+=tamt;
		break;
	}
	}
	System.out.println("Cusid\t"+"AccNo\t"+"Name\t"+"Balance\t");
	System.out.println(Cusid[vart]+"\t"+Accno[vart]+"\t"+Name[vart]+"\t"+Balance[vart]+"\t");
	

}
	
}

	


