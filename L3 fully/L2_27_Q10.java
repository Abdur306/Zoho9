import java.util.*;
class L2_27_Q10{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
int target=s.nextInt();
for(int i=0;i<n;i++){
	int k=0;
	for(int j=i+1;j<n;j++){
		if(target==k)
			System.out.println(a[i]);
		else
		k+=a[j];
	}
}
}
}