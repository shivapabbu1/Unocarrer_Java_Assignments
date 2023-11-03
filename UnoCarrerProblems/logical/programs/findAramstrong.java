package logical.programs;

public class findAramstrong {
	
	 public static boolean isAramstrong(int n) {
			int r,sum=0;
			int m=n;
		     while(n>0){
			r=n%10;
			sum+=(r*r*r);
			n=n/10;
			}
		 if(sum==m) {
			return true;
		 }else {
			return false;
		 }
	 }
	
public static void main(String[] args) {
    	
   for(int  n=1;n<=1000; n++) {
	   if(isAramstrong(n)==true) {
		   System.out.println(n+" ");
	   }
	}
    	 
}
}