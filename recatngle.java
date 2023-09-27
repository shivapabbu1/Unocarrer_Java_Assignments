package Control_Flow;
import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
public class recatngle {

	public static void main(String[] args) {
		 Scanner rectangle=new Scanner(System.in);
		 System.out.println("Enter your length of rectangle:");
		 int l=rectangle.nextInt();
		 System.out.println("Enter your Breadth of rectangle:");
		 int b=rectangle.nextInt();
		 rectangle.close();
		 int area=(l*b);
		 int perimeter=(l+b)*2;
		
		 System.out.println("Area of recarngle is :" +area);
		 System.out.println("Perimeter of recangle is:"+perimeter);
		 
		  if(area>perimeter) {
			  System.out.println("Area is greater to perimeter");
		  }else if(perimeter>area) {
			  System.out.println("perimeteris greater to  area");
		  }else {
			  System.out.println("Area is equal to perimeter");
		  }
		 

	}

}
