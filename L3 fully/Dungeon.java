import java.util.Scanner;
public class Dungeon {
public static void main(String[] args) {
	Treasure gold=new Treasure();
	gold.Task1();
	
}
}
class Treasure{
	public void Task1() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rows");
		int row=s.nextInt();
		System.out.println("Enter the column");
		int column=s.nextInt();
		char [][]a=new char[row][column];

		
for(int i=0;i<row;i++) {
	for(int j=0;j<column;j++) {			
		a[i][j]='*';   
	}
}
//for(int i=0;i<row;i++) {
//	for(int j=0;j<column;j++) {			
//		System.out.print(a[i][j]);   
//	}
//	System.out.println();
//    }
System.out.println("enter the position of Adventure");
int a1=s.nextInt();
int a2=s.nextInt();
a[a1-1][a2-1]='A';
System.out.println("enter the position of Gold");
int g1=s.nextInt();
int g2=s.nextInt();
a[g1-1][g2-1]='G';
for(int i=0;i<row;i++) {
	for(int j=0;j<column;j++) {			
		System.out.print(a[i][j]+"  ");   
	}
	 System.out.println();
    }
 	}
}

