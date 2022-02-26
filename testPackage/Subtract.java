package testPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Subtract {
	@Test
	@Parameters({"a","b"})
	public void subtract(int c, int d) {
		int sum = c-d;
		System.out.println("Subtract.java: c - d = " + sum);
	}
}
