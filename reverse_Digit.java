package Control_Flow;
import java.util.*;
public class reverse_Digit {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=num.nextInt();
		num.close();
		while(n!=0) {
			int rem=n%10;
			System.out.print(rem);
			n=n/10;
		}
	
		
}

}
