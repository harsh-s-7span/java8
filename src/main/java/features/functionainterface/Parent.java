package features.functionainterface;

@FunctionalInterface
public interface Parent
{
	void parentMethod();
	static void parentStaticMethod()
	{
		System.out.println("Static Parent method called...");
	}
}
