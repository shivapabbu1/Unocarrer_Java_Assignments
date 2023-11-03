package logical.programs;

public class DuplicateString {

	public static void main(String[] args) {
	String str="hello shiva";
	char ch[]=new char[str.length()];
	char s[]=new char[str.length()];
	int index=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ') {
			 continue;
		 }
		 for(int j=i+1;j<str.length();j++) {
			 
			 if(i!=j && str.charAt(i)==str.charAt(j)) {
				 ch[index]=str.charAt(i);
				 index++;
			  
			 }//if
			
		 }//for j
	}//for i
	for(int i=0;i<index;i++) {
		System.out.println(ch[i]);
	}
	

	}

}
