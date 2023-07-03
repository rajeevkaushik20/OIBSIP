package hellop;
import java.util.Scanner;
import java.util.Random;

public class guess_the_number {
	guess_the_number gsn = new guess_the_number();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int num = rn.nextInt(5);
		System.out.println("Enter your Guess number");
		int user_num = sc.nextInt();
		
		System.out.println(num);
		if(user_num<num) {
			System.out.println("its lower number ");
			System.out.println("re_try");
			guess_the_number.main(args);
			}
		else 
			if(user_num>num) {
				System.out.println("its high number");
				System.out.println("re_try");
				System.out.println(" ");
				guess_the_number.main(args);
				
			}
			else
				if(user_num==num) {
					System.out.println("congrats you guess the correct number");
				}
		}
}

