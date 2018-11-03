package org.apache.commons.beanutils;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({ BeanUtilsTest.class })
public class AllTests {
public static Test suite() {
TestSuite suite =new TestSuite("All Junit test");
suite.addTest(new JUnit4TestAdapter( BeanUtilsTest.class));
return suite;
} 
}
