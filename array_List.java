package arrays;



class Bank{
	int amount;
	int account_no;
	String name;
	
	public Bank(int amount,int account_no,String name) {
		this.account_no=account_no;
		this.amount=amount;
		this.name=name;
		System.out.println("New Account created with no."+ account_no + "with open balance is "+ amount +"with name as "+ name);
	}
	
	void deposit(int addmoney) {
		this.amount+=addmoney;
		System.out.println("sucessfully added money:"+ addmoney);
	}
	void withdraw(int debitmoney) {
		if(debitmoney>this.amount) {
			System.out.println("INSUFFICENT MONEY IN ACCOUNT");
		}else {
			this.amount-=debitmoney;
			System.out.println("sucessfully debited money:"+ debitmoney);
		}
		
	}
	void checkbalnce() {
		System.out.println("amount available in account:"+ amount);
	}
}

  public class array_List {
	
 public static void main(String[] args) {
	
	
	Bank Shivaaccount=new Bank(50000,12345,"Shiva");
	  Shivaaccount.checkbalnce();
	  Shivaaccount.deposit(3000);
	  Shivaaccount.checkbalnce();
	  Shivaaccount.withdraw(200);
	  Shivaaccount.withdraw(54200);
	
	
	
	
	
	
	
	
		

	}

}
