package org.news;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Suit {
	@Test
	public void runne() {
		
		Result m = JUnitCore.runClasses(TestA.class, TestB.class, TestC.class);
		
		int runCount = m.getRunCount();
		
		System.out.println("Run Count = "+ runCount);
		
		long runTime = m.getRunTime();
		
		System.out.println("Run Time = "+ runTime);
		
		int failureCount = m.getFailureCount();
		
		System.out.println("Failure Count = "+ failureCount);
		
		
		int ignoreCount = m.getIgnoreCount();
		
		System.out.println("Ignore Count = "+ ignoreCount);
		
		
	}
	
	
	
		
	

}
