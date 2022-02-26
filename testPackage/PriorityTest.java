package testPackage;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority=-5000)
	public void mytest1() {
		System.out.println("My Test1!");
	}
	
	@Test(priority=1)
	public void mytest2() {
		System.out.println("My Test2!");
	}
	
	@Test(priority=10)
	public void mytest3() {
		System.out.println("My Test3!");
	}
	
	@Test
	public void Ytest() {
		System.out.println("My Y Test!");
	}

	@Test
	public void Ztest() {
		System.out.println("My Z Test!");
	}


}
