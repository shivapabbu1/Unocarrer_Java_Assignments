package classProblems;

public class Recursion {

	static int Fact(int N){
	if(N>1) {
		if( N%2!=0) {
			return N+Fact(N-1) ;
		  } else {
			return Fact(N-1);
		  }//if
	  }//if
		else return 1;
	}//function
	
	//another way of function:
	
     private static int sumRec(int n) {
		
		if(n == 1) return 1;
		else {
			if( n % 2 == 0)  return sumRec(n-1);
			else  return n + sumRec(n-1);
		}
     }
	
	
	public static void main(String[] args) {
		System.out.println(Fact(5));
		System.out.println(sumRec(5));

	}
}
