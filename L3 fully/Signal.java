import java.util.*;
class Signal{
public static void main(String [] abu){

Remote access=new Remote();
access.doremote();
}
}
class Remote{
	
	public void doremote(){
		Scanner s=new Scanner(System.in);
		System.out.println("1.FirstSignal || 2.SecondSignal || 3.ThirdSignal || 4.FourthSignal || 5.FifthSignal");
		int input=s.nextInt();
		switch(input){
			case 1:
	               OneSignal one=new OneSignal();
                   one.NS_signal();				   
			       break;
			case 2:
			      SecondSignal two=new SecondSignal();
				  two.show1();
			       break;
			case 3:
			ThirdSignal three=new ThirdSignal();
			three.NS_signal();
			       break;
			case 4:
			  FourthSignal four=new FourthSignal();
			  four.show2();
			       break;
			case 5:
			FifthSignal five=new FifthSignal();
			five.NS_signal();
			       break;
		}
	}
	
}
abstract class Signal{
	
	public abstract void NS_signal();
}
class OneSignal extends Signal{
	
	public void NS_signal(){
		
		System.out.println("North South is green East West is red");
	}
}
class ThirdSignal extends Signal{
	
	public void NS_signal(){
		
		System.out.println("North South is green East West is red");
	}
	
}
class FifthSignal extends Signal{
	
	public void NS_signal(){
		
		System.out.println("North South is green East West is red");
	}
}


interface EW_signal{
	public void action();
}
class SecondSignal extends Signal implements EW_signal{
	
	public void show1(){
		action();
		NS_signal();
		
	}
	public void action(){
		System.out.println("East West is green North South is red");
	}
	public void NS_signal(){
		
		System.out.println("Error");
	}
}

class FourthSignal extends Signal implements EW_signal{
	
	
	public void show2(){
		action();
		NS_signal();
		
	}
	public void action(){
		System.out.println("East West is green North South is red");
	}
	public void NS_signal(){
		
		System.out.println("Error");
	}
}


