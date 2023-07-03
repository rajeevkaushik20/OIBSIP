package hellop;
import java.util.Scanner;

public class atm {
	atm at= new atm();

	public static void main(String[] args) {
		
		int withdraw=0,ch,deposit=0,pin=0,amount=100;
		try(Scanner sc = new Scanner(System.in)){
		System.out.println("Please enter your pin");
		pin=sc.nextInt();
		if(pin==9192)
		{
		System.out.println("Welcome to BINOD bank");
		System.out.println("Please enter your choice ");
		System.out.println("Press 1 for check amount ");
		System.out.println("Press 2 for WITHDRAW");
		System.out.println("Press 3 for DEPOSIT Amount ");
		System.out.println("Press 4 for EXIT  ");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Your total amount is "+amount);
			break;
		case 2:
				 
			System.out.println("Enter amount to withdraw");
		    withdraw=sc.nextInt();	
			if(withdraw>amount)
			{
				System.out.println("withdraw amount is more then current amount ");
			}
			else
			{
			System.out.println(withdraw+"amount is withdraw");
			withdraw= amount-withdraw;
			System.out.print(  "Your remaining amount is "  +withdraw);
			}
			break;
					
		case 3:
			System.out.println("Please Enter Deposit amount");
			deposit=sc.nextInt();
			amount = amount+deposit;
			System.out.println("Yor total amount is "+amount);
			break;
		case 4:
			System.out.println("Thank You");
			break;
		}
	  }
		else 
		{
			System.out.println("invalid pin ");
			System.out.println("Please Re-try");
			System.out.println("  ");
			atm.main(args);
		}
	}	
  }
}
