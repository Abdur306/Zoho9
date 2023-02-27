import java.util.*;
class Suduko{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int a[][]=int[9][9];
for(int i=0;i<9;i++){
for(int j=0;j<9;j++){
a[i][j]=s.nextInt();	
Table(a);
}
}
if(Backtrack(a,0,0)){
		print(a);
	else
		System.out.println("No-found");
	}
}
public static boolean Backtrack(int a[][],int r,int c){
	if(r==9){
		c++;
	if(c==9)
		return true;
	else
		r=0;
	if(a[r][c]!=0){
		return Backtrack(a,r+1,c);
	}
	for(int i=1;i<=9;i++){
		if(solve(a,r,c,i)){
			a[r][c]=i;
		if()
		
	}
	

}
}