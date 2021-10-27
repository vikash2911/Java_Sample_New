package org.news;

import org.testng.annotations.Test;

public class TestA {
	
	@Test(groups = "smoke")
	public void tc6() {
		
		System.out.println("Test 6"+Thread.currentThread().getId());
		
		
	}
	@Test(groups = {"sanity", "smoke"})
	public void tc4() {
		System.out.println("Test 4"+Thread.currentThread().getId());

	}
	@Test(groups ="regression")
	public void tc2() {
		System.out.println("Test 2"+Thread.currentThread().getId());

	}
	

}
