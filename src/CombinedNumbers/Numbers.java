package CombinedNumbers;

import java.util.Scanner;

public class Numbers {
	
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a non negative number");
		String choice1 = sc.nextLine();
	
		System.out.println("Input a second non negative number");
		String choice2 = sc.nextLine();
		
		System.out.println("Input a third non negative number");
		String choice3 = sc.nextLine();
		
		System.out.println("Input a fourth non negative number");
		String choice4 = sc.nextLine();
		
		System.out.println(choice1 + choice2 + choice3 + choice4);
	}
	

}
