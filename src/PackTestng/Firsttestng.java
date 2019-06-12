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
		System.out.println("for git project1");
		System.out.println("for git project2");
	}
	
	@Test
	public void grocerymilk()
	{
		System.out.println("Purchase Milk");
		System.out.println("for git project3");
		System.out.println("for git project4");
		System.out.println("for git project5");
		System.out.println("for git project6");
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
