package lianxi;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	Person p;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetName() {
	p = new Person("Lisi",20);
	System.out.println(p.getName());
	}

	@Test
	public void testGetAge() {
		p = new Person("Lisi",20);
		System.out.println(p.getAge());
	}
}
