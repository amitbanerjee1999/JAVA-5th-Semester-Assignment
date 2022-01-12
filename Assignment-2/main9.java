import java.util.*;
class Account{
	String customerName;
	String accountNumber;
	String typeofAccount;
	Account(String customerName,String accountNumber,String typeofAccount){
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.typeofAccount = typeofAccount;
	}
}

class Bank_Acct extends Account{
	double currBalance=0.0;
	Bank_Acct(String customerName,String accountNumber,String typeofAccount){
		super(customerName,accountNumber,typeofAccount);
	}
	void details(){
		System.out.println("Customer Name: "+customerName);
		System.out.println("Account Number: "+accountNumber);
	}
	void deposit(double d){
		currBalance = currBalance+d;
		System.out.println("Amount of Rs: "+d+"/= is deposited to your account.");
	}
	void balance(){
		System.out.println("Current Balance: "+currBalance);
	}
	void withdrawn(double d){
		if(d > currBalance){
			System.out.println("Sorry!! Withdrawing money is not possible.");
		}else{
			System.out.println("Rs:"+d+"/=is withdrawn from your current account");
			currBalance = currBalance-d;
		}
	}
}


class main9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		String cname = sc.nextLine();
		System.out.println("Enter Account Number: ");
		String accountNumber = sc.nextLine();
		System.out.println("Enter Type of Account(BA): ");
		String typeofAccount = sc.nextLine();
		
		if(typeofAccount.equals("BA")){
			Bank_Acct ca = new Bank_Acct(cname,accountNumber,typeofAccount);
			
			while(true){
				System.out.println("********* Bank Account Options *********");
				
				System.out.println("1. Deposit");
				System.out.println("2. Balance");
				System.out.println("3. Withdraw");
				System.out.println("4. Details");
				System.out.println("5. Exit");
				
				System.out.println("Enter Your Choice: ");
				int option = sc.nextInt();
				switch(option){
					
					
					case 1:
						System.out.print("Enter the amount to be deposited: ");
						double d = sc.nextDouble();
						
						ca.deposit(d);
						break;
						
					case 2:
						ca.balance();
						break;
					case 3:
						System.out.print("Enter the amount to be withdraw: ");
						double d1=sc.nextDouble();
						ca.withdrawn(d1);
						break;
					case 4:
						ca.details();
						break;
					case 5:
						System.exit(0);
					default:
						System.out.println("Wrong choice!!!");
				}
			}
		}
	}

}