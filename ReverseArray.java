package arrays;
import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array Length");
	  int[]arr=new int[sc.nextInt()];
	System.out.println("Enter Elements");
	 for(int i=0;i<arr.length;i++) {
	    	arr[i]=sc.nextInt();
	    }
	 sc.close();
	 
	 System.out.println("the array and array elemns are");
	 int j=0;
	 while(j<=arr.length-1) {
		 System.out.print(arr[j]+" ");
		 j++;
	 }
	 System.out.println("\n reversed array elemens");
	 for(int k=arr.length-1;k>=0;k--) {
		 System.out.println(arr[k]+" ");
	 }
	 
	 System.out.println("another revrse method ");
	  int temp;
	  for(int l=0;l<=arr.length-1;l++) {
		  temp=arr[l];
    	  arr[l]=arr[arr.length-1-l];
    	  arr[arr.length-1-l]=temp;
    	}
	  int m=0;
      while(m<=arr.length-1) {
    	  System.out.print(arr[m]+" ");
    	  m++;
      }
	  
	 
	 
       }
	
}
