package features.supplier;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo2
{
	// supplier to get random password.
	public static void main(String[] args)
	{
		Supplier<String> randomPassword = () -> {
			Predicate<Integer> checkIndex = i -> i % 2 == 0;
			Supplier<Integer> randomDigit = () -> (int) (Math.random() * 10);
			String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$%&*";
			Supplier<Character> randomChar = () -> {
				Double d = (Math.random() * 32);
				return characters.charAt(d.intValue());
			};
			StringBuilder password = new StringBuilder();
			for(int i=0; i<8; i++){
				if(checkIndex.test(i)){
					password.append(randomDigit.get());
				}else {
					password.append(randomChar.get());
				}
			}
			return password.toString();
		};

		System.out.println("Random password : " + randomPassword.get());
		System.out.println("Random password : " + randomPassword.get());
		System.out.println("Random password : " + randomPassword.get());
		System.out.println("Random password : " + randomPassword.get());
		System.out.println("Random password : " + randomPassword.get());
	}


}
