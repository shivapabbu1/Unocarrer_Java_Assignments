package logical.programs;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] n = {10,20,30,20,40,50,10,10,30};
		int[] m = new int[n.length];
		
		boolean isFound = false;
		int index = 0;
		for(int i=0;i<n.length;i++) {
			isFound = false;
			for(int j=0;j<index;j++) {
				if(n[i] == m[j]) {
					isFound = true;
				}
			}// for m Array
			if(isFound == false ) {
				m[index] = n[i];// m[0]=n[0]---m[0]=10,20
				index++;
			}// if
			
		}// n array
		System.out.println("Original Array Elements----->");
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println("\n After removing Array Elements----->");
		for(int i=0;i<index;i++) {
			System.out.print(m[i]+" ");
		}



	}

}
