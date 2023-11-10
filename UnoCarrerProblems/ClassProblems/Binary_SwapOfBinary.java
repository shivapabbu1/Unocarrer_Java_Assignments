
/*
 * 
 * Given an unsigned integer, swap all 0 bits with 1 bits and 1 bit to 0. For example, 
 * if the given number is 23 (10111),
 * then swap(10111)----> result should be--> 1000-convert to num as ->8
 */


package classProblems;

public class Binary_SwapOfBinary {

	public static void main(String[] args) {
		int n=23;
		int rem=0;  //to store remainder
		int binary=0; //to store binary value by swapping
		int pow=1; //to convert given num to binary
		int pow2=1; //to convert  result binary to num
		int secondnum=0;  //to store result
	
	
		while(n!=0) {
			rem=n%2;
			n=n/2;
			
			if(rem==0)  rem=1;
			else if(rem==1) rem=0;
			
			secondnum+=rem*pow2;
			binary+=rem*pow;
			pow=pow*10;
			pow2=pow2*2;
			
		}
		System.out.println("binary num of given num with swapping os and 1s:"+"\n"+ binary);
		System.out.println("Integer value of swapped binary num :"+"\n"+ secondnum);
		

           
		

	}

}
