package arrays;
import java.util.*;
public class numOfOccurance {

	public static int getoccur(int[]num, int searchelement) {
		 int occur=0;
		for(int i:num) {
			if(searchelement==num[i]) 
				occur++;
			}
		return occur;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to be serach");
		int searchelement=sc.nextInt();
		System.out.println("enter length array  ");
		int []num=new int[sc.nextInt()];
		System.out.println("enter elements array  ");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		 int j=0;
	     while(j<=num.length-1) {
	    	 System.out.print(num[j]+" ");
	    	 j++;
	     }
	     
	     int occur=0;
			for(int i=0;i<num.length-1;i++) {
				if(searchelement==num[i]) 
					occur++;
				}
		System.out.println("\n"+ searchelement+"ocuurs "+ occur+"times");
	}

}
