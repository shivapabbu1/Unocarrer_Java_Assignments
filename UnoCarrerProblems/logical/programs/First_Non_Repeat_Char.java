package logical.programs;

public class First_Non_Repeat_Char {

	public static void main(String[] args) {
		
    String str="swiss";
   char[]arr= new char[str.length()];
    char ch;
    int count=0;
    int index=0;
    boolean isPresent=false;
    for(int i=0;i<str.length();i++) {
    	for(int j=0;j<str.length();j++) {
    		ch=str.charAt(i);
    		if(ch==str.charAt(j)) {
    			isPresent=true;
    			count++;
    		}
    		else {
    			isPresent=false;
    			
    		}
    	}
    	if(isPresent==false) {
    		arr[index]=str.charAt(i);
    		index++;
    	}
    	
    }
		

    	
    	System.out.println(arr[0]);
    
		 

    
    
	}

}
