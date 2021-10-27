package org.flow;






import org.base.Base;
import org.testng.Assert;

import org.testng.annotations.Test;







public class Flow extends Base{
	@Test(retryAnalyzer = Failed.class)
	private void tc1() {
		System.out.println("Test 1");
		

	}
	@Test
	
	private void tc2() {
		System.out.println("Test 2");

	}
	@Test
	private void tc3() {
		
		Assert.assertTrue(false);
		System.out.println("Test 3");
		

	}
	
	@Test
	private void tc4() {
		
		
		System.out.println("Test 4");

	}
	
}
