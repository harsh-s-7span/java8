package exception_handling.eh1;

import java.util.Scanner;

public class VoteEligibility
{
	public static void main(String[] args) throws AgeException
	{
		System.out.println("Enter Your Age : ");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();

		if(age <= 18)
		{
			throw new AgeException("You are not eligible to vote :(");
		}else{
			System.out.println("You are eligible for voting.");
		}
	}
}
