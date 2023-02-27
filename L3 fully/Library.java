//package Inc;
import java.util.*;

public class Library{
	static Scanner s=new Scanner(System.in);
public static void main(String [] args){
	//Scanner s=new Scanner(System.in);
	Admin obj=new Admin();
	System.out.println("1.Admin login | 2.user Login");
		
	int  y=s.nextInt();
	switch(y){
		case 1:
		System.out.println("Admin login");
		obj.signin();
		break;
		
		case 2:
		System.out.println("User Login");
		
		break;
		
	}

}

}
 class Admin{
	
	String bname[]=new String[50];
	int bprice[]=new int[50];
	int bstock[]=new int[50];
	int count=0;
	  public  void signin(){
		  Admin obj2=new Admin();
			
		Scanner s1=new  Scanner(System.in);
	  String abu[]={"abdur","Abu@01"};
	  System.out.println("enter registered username");
	  String Uname=s1.next();
	  
	  System.out.println("enter registered password");
	  String Pwd=s1.next();
	  if(Uname.equals(abu[0])&& Pwd.equals(abu[1])) {
		  System.out.println("Admin signedin successfully");
	      Admin.recursion();}
	  else{
		  System.out.println("re-enter valid username & password");
		  obj2.signin();
	  } }
       
		 // int count=0;
	  public  static void recursion() {
		//  Admin.ad=new Admin();
		  Scanner s1=new Scanner(System.in);
		  Admin obj3=new Admin();
			Admin obj4=new Admin();
			Admin obj5=new Admin();
			Admin obj6=new Admin();
			Admin obj7=new Admin();
		  System.out.println("enter 1.view | 2.add | 3.update | 4.delete");
          int n=s1.nextInt();
         
switch(n){
case 1:
     System.out.println("view");
     obj3.view();
     break;
case 2:
      System.out.println("add");
      obj4.add();
      break;
case 3:
      System.out.println("update");
      obj5.update();
      break;
case 4:
      System.out.println("delete");
      obj6.delete();
      break;
default:
      System.out.println("re-enter the valid number");
      obj7.signin();
      break;

}}
public  void view(){

	int idarr[]={1,2,3};
	String bookname[]={"Hindu","dthan","dmani"};
	int bookprice[]={500,600,700};
	int bookstock[]={50,40,37,};
	System.out.println("bookid\t"+"bname\t"+"bprice\t"+"bstock\t");
	for(int i=0;i<idarr.length;i++){
		
			System.out.println(i+"\t"+bookname[i]+"\t "+bookprice[i]+"\t "+bookstock[i]);
	}
	Admin.recursion();
}


public   void add(){
	Scanner s2=new Scanner(System.in);
	System.out.println("enter the number of books to Add");
	int number=s2.nextInt();
	for(int i=2;i<number+2;++i){
		System.out.println("enter details of book , price, stock");
		bname[i]=s2.next();
		bprice[i]=s2.nextInt();
		bstock[i]=s2.nextInt();
	}
	
		Admin.recursion();
	}

	



public  void update(){

}
public  void delete(){


}

}

  class User {
//Scanner s1=new Scanner();
public void view(){

}
public void buy(){


}
public void read(){

}

}
