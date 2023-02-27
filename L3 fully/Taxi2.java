package Level3;

import java.util.Scanner;

public class Taxi {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			Working obj = new Working();
			obj.work();
		}
	}
	class Taxi1{
		int taxi_no;
		int total_earnings;
		char location;
		boolean busy;
		int endtime;
		
		public Taxi1(int i,char x){
			taxi_no=i;
			total_earnings=0;
			location=x;
			busy=false;
		}
	}
	class Booking2{
		int BookingId,CustomerId;
		int pickuptime,droptime;
		char from,to;
		int taxi_no;
		int fare;
	}

	class Working{
		Scanner scan = new Scanner(System.in);
		public void work() {
			Taxi1 obj[] = new Taxi1[5];
			Booking2 book[] = new Booking2[10];
			
			for(int i=1;i<5;i++) {
				obj[i]=new Taxi1(i,'A');
			}
			
			int index=0;
			boolean flag = true;
			do {
				System.out.println("1.Call taxi Booking\t2.Display the Taxi Details\t3.Exit");
				int ch=scan.nextInt();
				switch(ch) {
				case 1:{
					index++;
					book[index]=new Booking2();
					book[index].BookingId=index;
					System.out.println("CustomerID :");
					book[index].CustomerId=scan.nextInt();
					System.out.println("PICKUP POINT :");
					book[index].from=scan.next().charAt(0);
					System.out.println("DROP POINT :");
					book[index].to=scan.next().charAt(0);
					System.out.println("PICKUP TIME :");
					book[index].pickuptime=scan.nextInt();
					int min=100;
					for(int i=1;i<5;i++){
						int temp1=Math.abs((int)obj[i].location-(int)book[index].from);
						if(check(obj[i],book[index].pickuptime)){
							continue;
						}
						if(min>temp1){
							book[index].taxi_no=i;
							min=temp1;
						}
					}
						if(min==100) {
							System.out.println("Taxi cannot be alotted...");
						}
						else {
							System.out.println("Taxi can be allotted");
							book[index].fare=100+((Math.abs((int)book[index].from-(int)book[index].to)*15)-5)*10;
							obj[book[index].taxi_no].total_earnings+=book[index].fare;
							book[index].droptime=book[index].pickuptime+Math.abs((int)book[index].from-(int)book[index].to);
							obj[book[index].taxi_no].busy=true;
							obj[book[index].taxi_no].endtime=book[index].droptime;
							obj[book[index].taxi_no].location=book[index].to;
							System.out.println("Taxi-"+book[index].taxi_no+" is allotted");
						}
					}
					break;
				case 2:{
					for(int i=1;i<5;i++){
						System.out.println("Taxi-"+i+"\t"+"Total Earnings: Rs. "+obj[i].total_earnings);
						for(int j=1;j<index;j++){
							if(book[j].taxi_no==i){
								System.out.println(book[j].BookingId+" "+book[j].CustomerId+" "+book[j].from+" "+book[j].to+" "+book[j].pickuptime+" "+book[j].droptime+" "+book[j].fare);
							}
						}
					}
					break;
				}
				case 3:{
					flag = false;
					break;
				}
				}
			}while(flag);
			
		}	
		public static boolean check(Taxi1 obj,int pickuptime) {
			if(!obj.busy) {
				return false;
			}
			else {
				if(obj.endtime<=pickuptime) {
					return false;
				}
				return true;
			}
			
		}
	}

