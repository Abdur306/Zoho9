                                 /* LOGIN MODULE IT CONTAINS ADMIN AND USER TO SIGNIN OR SIGNUP*/

import java.util.Scanner;
public class LoginModule {  //LOGIN 1.admin ,2.user
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
                System.out.println("-------------------------------------------------");
                System.out.println("ENTER 1 FOR ADMIN LOGIN |  ENTER 2 FOR USER LOGIN");
                System.out.println("-------------------------------------------------");
		int n=s.nextInt();
               // Login  login=new Login ();
		switch(n) {
		case 1:
			System.out.println("admin login");
			Login.signup();
			break;
		case 2:
			System.out.println("user login");
		     Login.signup();
			break;
                default: 
                        System.out.println("enter 1 or 2 only");
                        break;
		}
	}
 class  Login{
public static void signup() {  //SIGNUP STATUS
		 Scanner s=new Scanner(System.in);
		 System.out.println("-------------------");
		 System.out.println("signup to singin");
		 System.out.println("-------------------");
		System.out.println("enter the username");
		String username=s.nextLine();
                int upperCount=0;
		int lowerCount,digitCount, letterCount, specialCount;
		lowerCount=digitCount=letterCount=specialCount=0;
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("THE USER SHOULD HAVE THE PASS COMBINATION ATLEAST 2 OF EACH UPPER,LOWER,@,# CASES...");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("PLEASE ENTER THE PASSWORD");
		Scanner s1=new Scanner(System.in);
		String password=s1.nextLine();
		int inputlen=password.length();
		for(int i=0;i<inputlen;i++) {
			char[] ch=password.toCharArray();
			if(inputlen>=8 && ch[i]>=65 || ch[i]<=90 && ch[i]==35 && ch[i]==64){
			System.out.println("valid password");
               break;			
			}
				
		/*	else if(password.charAt(i)>=97 && password.charAt(i)<=122) 
				lowerCount++;
			else if (password.charAt(i)>=48 && password.charAt(i)<=57) 
				digitCount++;
			else if(password.charAt(i)>=33 && password.charAt(i)<=46)
			specialCount++;*/
				else{
					System.out.println("invalid password.Re-enter the password");
				  Login.signup();
				}
		}
		/*if(upperCount>=1 && lowerCount>=1 && digitCount>=1 && specialCount>=1) 
			 System.out.println("valid password");
		else{
			System.out.println("re-enter the valid password");
                       Login.signup();
		}*/		
System.out.println("please signin .you signed up successfully");
signin(username, password);
}
 public static void signin(String username,String password ){    //SIGNIN STATUS
	      System.out.println("----------------------------");
	      System.out.println("fill the Details to singin");
         Scanner s=new Scanner(System.in);
         System.out.println("-----------------------------");
         System.out.println("enter the registered username");
           String signname=s.nextLine();    
         System.out.println("------------------------------");
         System.out.println("enter the  registered password");
           String signpass=s.nextLine();
         if(username.equals(signname) && password.equals(signpass))
        	 System.out.println("welcome.you had been login successfully");         
         else{
        	 System.out.println("----------------------------");
        	 System.out.println("invalid username or password");
          Login.signin(username, password );
}
}
}
}
/* public class ClientLogin extends AdminLogin{   //ADMINLOGIN FLOW
	public  void signup1() {
		 Scanner s=new Scanner(System.in);
		 System.out.println("-------------------");
		 System.out.println("signup to singin");
		System.out.println("enter the username");
		String username=s.nextLine();
                int upperCount=0;
		int lowerCount,digitCount, letterCount, specialCount;
		lowerCount=digitCount=letterCount=specialCount=0;
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("THE USER SHOULD HAVE THE PASS COMBINATION ATLEAST 2 OF EACH UPPER,LOWER,DIGITS,SPECIAL CASES...");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("PLEASE ENTER THE PASSWORD");
		Scanner s1=new Scanner(System.in);
		String password=s1.nextLine();
		int inputlen=password.length();
		for(int i=0;i<inputlen;i++) {
			char ch=password.charAt(i);
			if(password.charAt(i)>=65 && password.charAt(i)<=90) 
				upperCount++;
				
			else if(password.charAt(i)>=97 && password.charAt(i)<=122) 
				lowerCount++;
			
			else if (password.charAt(i)>=48 && password.charAt(i)<=57) 
				digitCount++;
			else if(password.charAt(i)>=33 && password.charAt(i)<=46)
			specialCount++;
				else 
					System.out.println();
			
		
		}
		
		if(upperCount>=1 && lowerCount>=1 && digitCount>=1 && specialCount>=1) 
			 System.out.println("valid password");
		else{
			System.out.println("re-enter the valid password");
                       AdminLogin.signup();
		}
		
System.out.println("please signin .you signed up successfully");
signin(username, password);
}

               

 public static void signin(String username,String password ){    //SIGNIN STATUS
	      System.out.println("----------------------------");
	      System.out.println("fill the Details to singin");
         Scanner s=new Scanner(System.in);
         System.out.println("-----------------------------");
         System.out.println("enter the registered username");
           String signname=s.nextLine();    
         System.out.println("------------------------------");
         System.out.println("enter the  registered password");
           String signpass=s.nextLine();
         if(username.equals(signname) && password.equals(signpass))
        	 System.out.println("welcome.you had been login successfully");         
         else{
        	 System.out.println("----------------------------");
        	 System.out.println("invalid username or password");
          AdminLogin.signin(username, password );
}
}
	
}
}*/

