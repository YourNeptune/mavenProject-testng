package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenTest1 {
	
	@Test  
	public void sum() {  
		System.out.println("Sum method in MavenTest1.java");  
		int p=10;  
		int q=20;  
		Assert.assertEquals(30, p+q);  
	}  
	@Test  
	public void sub() {  
		System.out.println("Sub method in MavenTest1.java");  
		int p=20;  
		int q=10;  
		Assert.assertEquals(10, p-q);  
	}  

}
