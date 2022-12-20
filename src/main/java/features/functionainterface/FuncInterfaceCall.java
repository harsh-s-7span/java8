package features.functionainterface;

public class FuncInterfaceCall
{
	public static void main(String[] args)
	{
		FuncInterface1 functionalInterface = () -> System.out.println("Functional Interface lambda call...");
		functionalInterface.printMe();

		FuncInterface2 funcInterface2 = s -> System.out.println("Length of string is " + s.length());
		funcInterface2.lengthOfStr("write null here");

		FuncInterface3 funcInterface3 = i -> i*i;
		System.out.println("Square is " + funcInterface3.squareOf(5));
		System.out.println("Square is " + funcInterface3.squareOf(10));
	}
}
