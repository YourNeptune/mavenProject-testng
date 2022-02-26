package testPackage;

import org.testng.annotations.Test;

public class TimeoutTest {
	@Test(timeOut=200)
	public void mytest1() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("My Test1!");
	}
	
	@Test(dependsOnMethods= {"mytest1"})
	public void mytest2() {
		System.out.println("My Test2!");
	}
	
	@Test
	public void mytest3() {
		System.out.println("My Test3!");
	}
}
