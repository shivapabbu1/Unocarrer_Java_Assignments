package recursion_problems;
import java.util.*;

public class PrimeNumber {
	
	static int count = 0;
	
	static int temp =2;
	static int   isPrime(int n ,int i) {
		if(i<=n) {
			if(n%i==0) {
				count++;
				return isPrime(n,i+1);
			}
			else
				return 
				isPrime(n,i+1);
		}
		if(count>2) {
			System.out.println("The number is not prime");
		}
		else {
			System.out.println("The number is prime");
			 return n;
		}
		return n;
        
        }//function  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to be checked for is prime?");
		int n=sc.nextInt();
		int i=n/2;
       int res =isPrime(n,i);
	}

}
