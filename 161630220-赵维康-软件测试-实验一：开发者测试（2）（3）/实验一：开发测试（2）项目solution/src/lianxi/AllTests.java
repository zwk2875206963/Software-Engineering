package lianxi;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({ PersonTest.class })
public class AllTests {
public static TestSuite suite() {
TestSuite suite = new TestSuite("All JUnit test");
suite.addTest(new JUnit4TestAdapter(Person.class));
return suite;
}
}
