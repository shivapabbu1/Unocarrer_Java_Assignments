
/*
 1>For a given array of integers (positive and negative) 
 find the largest sum of a contiguous sequence
{10,20,-3,5,0,1,-11,55,-77}
*/


package classProblems;

public class LargestSumOfContiguios {

	public static void main(String[] args) {
		int a[] = { 10,20,-70,98,12};
         
		int maxsum = a[0];
		int minsum=a[0];
	    int maxEnd =0;
		int maxStart =0;
		 int minEnd =0;
		int minStart =0;
		int[]maxsubarray=new int[a.length];
		int[]minsubarray=new int[a.length];
		int index=0;
		
		for (int i=0; i<a.length; i++) {
			int sum = 0;
			for (int j=i;j<a.length;j++) {
				sum+=a[j]; 
					if (maxsum< sum) {
						maxsum = sum;
						maxEnd =j;
						maxStart =i;
					}//if max
					if(minsum>sum) {
						minEnd=j;
						minStart=i;
						minsum=sum;
					}//if min
				}//for j
			}//for i
		 
		   System.out.println(" the Maximum  sum values is :"+maxsum);
		    System.out.println(" the MaxStart index :"+maxStart);
			System.out.println(" the MaxEnds index :"+maxEnd);
			
			System.out.println(" the Minimum sum values is :"+minsum);
		    System.out.println(" the MaxStart index :"+minStart);
			System.out.println(" the MaxEnds index :"+minEnd);
			
			   for(int i=maxStart;i<=maxEnd;i++) {
					maxsubarray[index]=a[i];
					index++;
					}
			   System.out.println("MAXsum sub array is:");
			  for(int k=0;k<index;k++) {
				System.out.print(maxsubarray[k]+ " ");
		  	 }
			
			

	  
	
 }//main
}//class
