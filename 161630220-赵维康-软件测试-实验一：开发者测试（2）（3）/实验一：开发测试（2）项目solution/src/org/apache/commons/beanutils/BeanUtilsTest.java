package org.apache.commons.beanutils;
import lianxi.Person;
import lianxi.Class;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

public class BeanUtilsTest {

	@Test
	public void testCloneBean()throws Exception {
        Person sir = new Person("sir1",20);
        Class c = new Class(1, sir);

        Person sir2 = (Person) c.getSir();
        Class c2 = (Class) BeanUtils.cloneBean(c);
        c2.setSir(sir2);
        
        assertNotSame(c, c2);
        assertNotSame(c.getSir(), c2.getSir());
        c.getSir().setName("xx");
        assertFalse(c2.getSir().getName().equals("xx"));
        System.out.println("clone is deep");
	}  
}
