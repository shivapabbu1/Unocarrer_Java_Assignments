package Control_Flow;
import java.util.*;

public class traingle {

	public static void main(String[] args) {
	  // problem: WPA to check it is vaild traingle or not?
		
	 Scanner obj =new Scanner(System.in); 
	 System.out.println("Enter your all sides of traingle");
		  int a=obj.nextInt();
		  int b=obj.nextInt();
		  int c=obj.nextInt();
		  obj.close();
		  int sum=(a+b+c);
		if(sum ==180) {
			System.out.println(" it is a valid traingle");
	    }
		else 
			System.out.println(" it is not  a valid traingle");
	}
			
}
