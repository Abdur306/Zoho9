

import java.util.Scanner;

public class RReservation {
	static int lowerb = 2;
	static int middleb = 2;
	static int upperb = 2;
	static int racb = 2;
	static int w_listw = 2;
	static String[] Name;
	static int[] Age;
	static String[] Birth;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n;
		do {
			System.out.println(
					"\t\n         ..................\n\t *1.Availabilities* \n\t *2.Booking \t  * \n\t *3.Cancelation   * \n\t *4.Chat          * \n\t *5.Exist         *  \n         ..................");

			n = s.nextInt();
			switch (n) {
			case 1:
				System.out.println("Availabilities ");
				RReservation.availability();
				break;

			case 2:

				RReservation.Bookticket();
				break;

			case 3:

				System.out.println("enter the passenger id");
				break;

			case 4:
				System.out.println("chat prepared");
				break;

			case 5:
				System.out.println("thank you visit again");
			}

		} while (n != 5);

	}

	// class TicketsBooker{

	public static void availability() {

		System.out.println(
				"Lower=" + lowerb + "\nMiddle=" + middleb + "\nUpper=" + upperb + "\nrac=" + racb + "\nW/L=" + w_listw);

	}

	public static void Bookticket() {
		Scanner s1 = new Scanner(System.in);
		if (lowerb < 1 && middleb < 1 && upperb < 1 && racb < 1 && w_listw < 1) {
			System.out.println("No Tickets are Available");
			
		}
		else {
		System.out.println("enter how many tickets");
		int n1 = s1.nextInt();			
		System.out.println("enter the passenger name,age,birth_preference");
		String newName;
		int newAge;
		String newBirth;
		for (int i = 0; i < n1; ++i) {
			
			newName = s1.next();
			newAge = s1.nextInt();
			newBirth = s1.next();
			Name = update_Name(Name, newName);
			Age = update_Age(Age, newAge);
			
			if(newAge>=50)
				newBirth="L";
			//if(newAge<=10)
				//newBirth="";

				if (newBirth.equals("L")) {
					if (lowerb > 0) {
						Birth = update_Birth(Birth, newBirth);
						lowerb--;
					} else if (middleb > 0) {
						Birth = update_Birth(Birth, "middle");
						middleb--;
					} else if (upperb > 0) {
						Birth = update_Birth(Birth, "upper");
						upperb--;
					} else if (racb > 0) {
						Birth = update_Birth(Birth, "rac");
						racb--;
					} else if (w_listw > 0) {
						Birth = update_Birth(Birth, "w/l");
						w_listw--;
					}
				}
			if (newBirth.equals("M")) {
				if (middleb > 0) {
					Birth = update_Birth(Birth, newBirth);
					middleb--;
				} else if (upperb > 0) {
					Birth = update_Birth(Birth, "upper");
					upperb--;
				}else if (lowerb > 0) {
					Birth = update_Birth(Birth, "lower");
					lowerb--;
				} else if (racb > 0) {
					Birth = update_Birth(Birth, "racc");
					racb--;
				} else if (w_listw > 0) {
					Birth = update_Birth(Birth, "wlc");
					w_listw--;
				}
			}
			if (newBirth.equals("U")) {
				if (upperb > 0) {
					Birth = update_Birth(Birth, newBirth);
					upperb--;
				} else if (middleb > 0) {
					Birth = update_Birth(Birth, "middle");
					middleb--;
				} else if (lowerb > 0) {
					Birth = update_Birth(Birth, "lower");
					lowerb--;
				} else if (racb > 0) {
					Birth = update_Birth(Birth, "rac");
					racb--;
				} else if (w_listw > 0) {
					Birth = update_Birth(Birth, "w/l");
					w_listw--;
				}
				
			}
		
		}
		System.out.println("Booked Successfully");
		RReservation.view();
		System.out.println( "Name\t" + "Age\t" +"seat\t"  +"Birth");
		for (int k = 1; k <= Name.length; k++) {
			System.out.println( Name[k - 1] + "\t" + Age[k - 1] +"\t"+    k + "\t"  +         Birth[k - 1]);
		}

	}
	}
	private static String[] update_Birth(String[] existingBerth, String string) {
		if (existingBerth == null) {
			existingBerth = new String[0];
		}
		String[] berth = new String[existingBerth.length + 1];
		for (int i = 0; i < existingBerth.length; i++) {
			berth[i] = existingBerth[i];
		}
		berth[existingBerth.length] = string;
		return berth;
	}

	private static int[] update_Age(int[] existingAge, int number) {
		if (existingAge == null) {
			existingAge = new int[0];
		}
		int[] age = new int[existingAge.length + 1];
		for (int i = 0; i < existingAge.length; i++) {
			age[i] = existingAge[i];
		}
		age[existingAge.length] = number;
		return age;
	}

	private static String[] update_Name(String[] existingName, String string) {
		if (existingName == null) {
			existingName = new String[0];
		}
		String[] name = new String[existingName.length + 1];
		for (int i = 0; i < existingName.length; i++) {
			name[i] = existingName[i];
		}
		name[existingName.length] = string;
		return name;
	}
	// }

public static void view() {
	System.out.println(" -----------------------\t"+"--------------------------\t"+"---------------------------\t"+" -----------------\t");
	System.out.println(" Depature Time :- 13:00 \t"+"Boarding jn : mas-chennai \t"+"Destination jn : teni-Teni \t"+" Distance = 505km \t");
	System.out.println(" -----------------------\t"+"--------------------------\t"+"--------------------------\t"+" -----------------\t");
}
}
class Cancel {

}
