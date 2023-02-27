import java.util.*;
class L3Test{
	public static void main(String[] args){
		Hospital hos=new Hospital();
		hos.Old();
	}
}
class Hospital{
	static Scanner scan = new Scanner(System.in);
	private int PId[]=new int[3];
	private String PName[]=new String[3];
	private int InTime[]=new int[3];
	private int OutTime[]=new int[3];
	private int WaitTime[]=new int[3];
	int consaltant=15;
	int doc_time;
	int total;int i=0;
	static int id=680,j=0;
	public void Old(){
		System.out.println("Enter the Patient ID: ");
		int lId=scan.nextInt();
		System.out.println("Enter the Patient Name: ");
		String LName=scan.next();
		for(int i=0;i<PId.length;i++){
			if(lId==PId[i]&& LName.equals(PName[i])){
				PDetails();
				break;
			}
			else{ //if(i==PId.length-1){
				System.out.println("No record found");
				NewPatient();
				break;
			}
		}
	}
	public void UserChoose(){
		System.out.println("1.New Patient || 2.Old Patient || 3.Display || 4.Exit");
		int userInput=scan.nextInt();
		switch(userInput){
			case 1:
			Old();
			UserChoose();
			break;
			case 2:
			old_patient();
			UserChoose();
			break;
			case 3:
		    display();	
			UserChoose();
			break;
			case 4:
			System.out.println("exit");
			break;
			default :
			System.out.println("invalid input");
		}
	}
	public void NewPatient(){
		PId[j]=id;
		//System.out.println("New Patient id: "+id);
		System.out.println("Enter the Patient Name: ");
		PName[j]=scan.next();
		id++;
		PDetails();
	}
	public void PDetails(){
		//old();
		System.out.println("Enter the Patient In Time: ");
		InTime[j]=scan.nextInt();
		System.out.println("enter the patient out Time");
		OutTime[j]=scan.nextInt();
		System.out.println("enter the Doctor Time");
		 doc_time=scan.nextInt();
		 j++;
		timemangement();
	}
	public void timemangement(){
		// for(i=0;i<PName.length;i++){
		 total=OutTime[i]-InTime[i];
		 WaitTime[i]=Math.abs(total-(consaltant+doc_time));
		if(WaitTime[i]>0){
			System.out.println("Sorry by OPD Management");
			//break;
		}
		 //}
		// for(i=0;i<PName.length;++i)
			 //System.out.println(WaitTime[i]);
		i++;UserChoose();
	}
	public void display(){
		System.out.println("pid \t"+"PNmae \t"+"InTime \t"+"OutTime \t"+"Waiting Time \t");
		for(i=0;i<PName.length;++i){
		System.out.println(PId[i] +"\t"+PName[i] +"\t"+InTime[i]+ "\t"+OutTime[i]+"\t"+"\t"+WaitTime[i]+"\t");
		//break;
		}
		
	}
	/*public void old_patient(){
		Old();
		//PDetails();
	}*/
}