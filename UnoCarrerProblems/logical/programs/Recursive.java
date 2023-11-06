package logical.programs;

public class Recursive {

	
	static long fact(int n){
		if(n == 1) return 1;
		else  return n * fact(n-1);
	
	}
 //Recursion function but it is n to 1---->5*4*3*2*1=120
	static	int res=1;
	static int Fact(int N) {
		 res++;
		if(res==N) {
			return N;
		}else {
			return res*Fact(N);
		}
	}
	//Recursion function but it is 1to n---->1*2*3*4*5=120

	
	public static void main(String[] args) {
	
	// recursion
		
		int n =5;// 
		System.out.println("res form n to 1----->"+fact(n));
		System.out.println("res form 1 to n----->"+Fact(n));
		
	}



	}


