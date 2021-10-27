package org.news;

import org.testng.annotations.Test;

public class TestB {
	
	@Test(groups = "regression")
	
	public void tc1() {
		System.out.println("Test 1"+Thread.currentThread().getId());
		

	}
	
	@Test(groups = {"smoke", "sanity"})
	public void tc3() {
		System.out.println("Test 3"+Thread.currentThread().getId());

	}
	@Test(groups = "sanity")
	public void tc5() {
		System.out.println("Test 5"+Thread.currentThread().getId());

	}

}
