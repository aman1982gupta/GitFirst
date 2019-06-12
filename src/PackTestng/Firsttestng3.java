package PackTestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Firsttestng3 {
	
	@Test
	public void kitchenspoon()
	{
		System.out.println("Purchase spoon");
	}
	
	@Test
	public void kitchenplate()
	{
		System.out.println("Purchase plate");
		System.out.println("for git develop brach2");
	}
	@AfterMethod
	public void aftereverymethod()
	{
		System.out.println("Run after every method");
	}
	
	@Test
	public void kitchenbowl()
	{
		System.out.println("Purchase bowl");
	}
}
