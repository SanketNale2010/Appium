import org.testng.annotations.Test;

public class test15 {
	
	@Before public void beforeMeth()
	{
	System.out.print("Before Method");
	}
	@Test void one()
	{
	System.out.print("In Test 1");
	}
	@Test void two()
	{
	System.out.print("In Test 2");
	}
	@After public void afterMeth()
	{
	System.out.print("After Method");
	}		

}
