package features.defaultmethod;

// solving method ambiguity problem with interface's default method
public class Demo2 implements Left, Right
{
	public static void main(String[] args)
	{
		Demo2 demo = new Demo2();
		demo.m1();
	}

	// you have to override the method to solve the problem.
	@Override
	public void m1()
	{
		// Implement in your way..
		// System.out.println("My Own implementation..");

		// Use Left interface method
		// Left.super.m1();

		// Use Right interface method
		Right.super.m1();
	}
}

interface Left{
	default void m1(){
		System.out.println("Left method implementation...");
	}
}

interface Right{
	default void m1(){
		System.out.println("Right method implementation...");
	}
}
