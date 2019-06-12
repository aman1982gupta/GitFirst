package PackTestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firsttestng {
	
	@Test
	public void demo()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void grocerymilk()
	{
		System.out.println("Purchase Milk");
	}
	
	@BeforeMethod
	public void beforeeeverymethod()
	{
		System.out.println("Run before every method");
	}
	
	@AfterTest
	public void grocerybread()
	{
		System.out.println("Purchase Bread");
	}
}
