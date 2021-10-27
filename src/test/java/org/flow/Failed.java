package org.flow;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed implements IRetryAnalyzer{
	
	int min = 0, max = 1;
	
	public boolean retry(ITestResult result) {
		
		if (min<max) {
			min++;
			return true;
			
		}
		return false;

	}

}
