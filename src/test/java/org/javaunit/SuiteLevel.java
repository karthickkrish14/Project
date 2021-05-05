package org.javaunit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class SuiteLevel {
	public static void main(String[] args) {
		
		Result runClasses = JUnitCore.runClasses(SampleSuite.class);
		int failureCount = runClasses.getFailureCount();
		System.out.println("Total Failure Count: "+failureCount);
		int ignoreCount = runClasses.getIgnoreCount();
		System.out.println("Total Ignore Count: "+ignoreCount);
		int runCount = runClasses.getRunCount();
		System.out.println("Total Run Count: "+runCount);
		long runTime = runClasses.getRunTime();
		System.out.println("Total Run Time: "+runTime);
		
		List<Failure> failures = runClasses.getFailures();
		for (int i = 0; i < failures.size(); i++) {
			System.out.println(failures.get(i));
			
		}
		
	}

}
