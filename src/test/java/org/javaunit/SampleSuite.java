package org.javaunit;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


	
	@RunWith(Suite.class)
	@SuiteClasses({SampleJunit1.class,SampleJunit2.class,SampleJunit3.class})
	

	public class SampleSuite {
		
	}
