package Control_Flow;
import java.util.*;
public class salaryInHand {
	static  double annualIncome;
	static   double taxbleIncome;
	static  double taxlaible=0;
	static double firsttaxrate=0,secondtaxrate=0,thirdtaxrate=0;
	public static void main(String[] args) {
		 
        Scanner Amount=new Scanner(System.in);
        System.out.println("Enter your monthly Salary:");
        double salary=Amount.nextDouble();
        System.out.println("Enter your tax saving investment:");
        double taxsaveinvestment=Amount.nextDouble();
        Amount.close();
    	
        double maxinvestment=100000;
        //find annual income
        annualIncome=salary*12;
        
        //find investment amount i.e taxable income
        if(taxsaveinvestment>100000) {
        	taxbleIncome=(annualIncome-maxinvestment);
        	
        }else {
        	 taxbleIncome=(annualIncome-taxsaveinvestment);
        
        }
    
      
         //find tax rates
         if(taxbleIncome<=250000) {
        	 firsttaxrate=0;
        	 taxlaible=firsttaxrate;
             		
           } 
            if(taxbleIncome>250000 && taxbleIncome<=500000) {
        	   firsttaxrate=0;  
        	  secondtaxrate=( (5 * (250000))/100);

        	  taxlaible=firsttaxrate+secondtaxrate;
        	  System.out.println("taxlaibleincome for second:"+ taxlaible);
           } 
            if(taxbleIncome>500000 &&taxbleIncome<=1000000) {
        	   firsttaxrate=0;  
        	   secondtaxrate=( (5 * (250000))/100);
        	  thirdtaxrate=((20 * (taxbleIncome - 500000))/100);

        	 taxlaible=firsttaxrate+secondtaxrate+thirdtaxrate;
        	  System.out.println("taxlaibleincome for third:"+ taxlaible);
             }

	
        
        System.out.println("taxlaibleincome overall:"+ taxlaible);
        
         double incomeAftertax=annualIncome-taxlaible;
         double salaryInHand=(incomeAftertax/12);
         
         
         
         System.out.println("annual income:"+ annualIncome);
         System.out.println("taxable income:"+ taxbleIncome);
         System.out.println("tax payble(per year):"+ taxlaible);
         System.out.println("salary in hand:"+ salaryInHand);
        
	}

}
