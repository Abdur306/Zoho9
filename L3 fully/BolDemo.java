import java.util.*;
class BolDemo{
public static void main(String []abu){
Scanner s=new Scanner(System.in);
String str[]={"abdul","adil","suthis","jameel","suhail"};
int rollno[]={100,101,102,103,104};
String use=s.next();
int urol=s.nextInt();
for(int i=0;i<rollno.length;i++){
	if((use.equals(str[i]))&& (urol==rollno[i])){
		System.out.println("Succuess");
		break;
	}
	else{
		System.out.println("Sorry worng");
		
	}
	
}


}
}