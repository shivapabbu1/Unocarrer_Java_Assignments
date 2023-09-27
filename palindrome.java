package Control_Flow;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		Scanner number=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=number.nextInt();
		number.close();
		 int temp=n;
		 int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum=sum*10+rem;;
			n=n/10;
		}
		if(sum==temp){
			System.out.println("yahh it is a palindrome Number");
		}else {
		System.out.println("noo! its not a palindrome number");
	    }
	}

}
