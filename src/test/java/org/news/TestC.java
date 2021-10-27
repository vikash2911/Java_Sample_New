package org.news;

import org.testng.annotations.Test;

public class TestC {

	
	@Test(groups = "sanity")
	public void tc7() {
		System.out.println("Test 7"+Thread.currentThread().getId());

	}
	@Test(groups = "smoke")
	public void tc9() {
		System.out.println("Test 9"+Thread.currentThread().getId());

	}
	@Test(groups= "regression")
	public void tc8() {
		System.out.println("Test 8"+Thread.currentThread().getId());

	}
}
