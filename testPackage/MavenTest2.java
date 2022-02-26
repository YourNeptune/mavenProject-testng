package testPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MavenTest2 {

	@Test(groups = {"ByeTest"})
	public void mytest1() {
		System.out.println("Bye my Test1!");
	}
	
	@Test(groups= {"ByeTest", "HelloTest"})
	public void mytest2() {
		System.out.println("Hello&Bye my Test2!");
	}
	
	@Test(groups= {"HelloTest"})
	public void hertest1() {
		System.out.println("Hello her Test1!");
	}
	
	@Test(groups= {"OtherTest"})
	public void otherTest1() {
		System.out.println("Other Test1!");
	}
	
	@BeforeSuite(groups= {"OtherTest"})
	public void firstMethod() {
		System.out.println("First Method");
	}
	
	@AfterSuite(groups= {"OtherTest"})
	public void lastMethod() {
		System.out.println("Last Method");
	}
	
	@BeforeMethod
	public void before_method() {
		System.out.println("This method will be invoked before every test method in MavenTest2.java");
	}
	
	@BeforeClass
	public void before_class() {
		System.out.println("This method will be invoked before class in MavenTest2.java");
	}

}
