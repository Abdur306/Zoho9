import java.util.*;
class ObjArr{
public static void main(String [] abu){

Students std=new Students();
std.getDetails();
}
}
class Details{
	String sname;
		int sage;
		int sid;
		String sadd;
		
	public Details(String sname,int sage,int sid,String sadd){
		this.sname=sname;
		this.sage=sage;
		this.sid=sid;
		this.sadd=sadd;		
	}
	public String toString(){
		return sname+" "+sage+" "+sid+" "+sadd;
	}
}

class Students{
 static Scanner s=new Scanner(System.in);
 ArrayList<Details>arr=new ArrayList<Details>();
 static int k=0;
public void getDetails(){
	System.out.println("How many students want to enter");
	int si=s.nextInt();
	for(int i=0;i<si;i++){
System.out.println("Enter name ");
String sname=s.next();
System.out.println("Enter age ");
int sage=s.nextInt();
System.out.println("Enter sid ");
int sid=s.nextInt();
System.out.println("Enter Address ");
String sadd=s.next();
arr.add(k,new Details(sname,sage,sid,sadd));
k++;
}
for(Details data:arr)
System.out.println(data);	
}
}