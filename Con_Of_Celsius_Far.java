package coreJava;
import java.util.*;
public class Con_Of_Celsius_Far {

	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
		    
		    System.out.println("enter the Farenhiet");
		    double f = obj.nextDouble();
		    
		    double c = (f-32)*5/9;
		    
		    double p = c-(int)c;
		    int Cel =(int)c;
		    
		    if(p>=0.5)
		    	Cel +=1;
		    
		    System.out.println("the celcius is "+Cel );
			}

	}


