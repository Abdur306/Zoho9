import java.util.*;
public class HospitalManagement{
static String in_time;
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("how many patient should enter");
int n=s.nextInt();
Patient a[]=new Patient[n];
for(int i=0;i<n;i++){
	int id=(681+i);
	String name=s.next();
    in_time=s.next();
	a[i]=new Patient(id,name,in_time);
	patient_history(id,name);
	}
	history(id,name);
	System.out.println("enter the new time");
    for(int i=0;i<a.length();++i){
	if(id.equals(b[i]) && name.equals(b[i])){
	      in_time=s.next();
	}
	//System.out.println(a[i].id+"\t"+a[i].name+"\t"+a[i].in_time+" \t");
	}


}
}
class Patient{
	//Scanner s=new Scanner(System.in);
	int id[]=new int[n];
	String name=new String[n];
	String  in_time=new in_time[n];
	public Patient(int id,String name,String in_time){
		this.id=id;
		this.name=name;
		this.in_time=in_time;
	}
	static void history(int id,String name){
		
		
		for(int i=0;i<2;++i){
			int id=682;
			String name="jameel";
			
		}
	patient_history b[]=new patient_history[1];
    b[0]={681,"abdur"};
    b[1]={682,"jameel"};
	
	
		
	}

	
}