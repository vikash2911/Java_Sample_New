package org.flow;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedAll implements IAnnotationTransformer{
	
	


	public void transform(ITestAnnotation a, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer b = a.getRetryAnalyzer();
		a.setRetryAnalyzer(Failed.class);
		
		
	}}