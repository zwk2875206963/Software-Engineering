package lianxi;

import java.lang.reflect.InvocationTargetException; 
import java.util.HashMap;  
import java.util.Map;  
import org.apache.commons.beanutils.BeanUtils;  
import org.apache.commons.beanutils.ConvertUtils;   
public class Test {  

/** 

* @param args 

*/  
public static void main(String[] args) {   
try {  
        String person ="lisi";
	//¿ËÂ¡  
    Person person2 =  (Person)BeanUtils.cloneBean(person);  
    System.out.println(person2.getName()+">>"+person2.getAge());  
} catch (IllegalAccessException e) {  
    e.printStackTrace();  
} catch (InstantiationException e) {  
    e.printStackTrace();  
} catch (InvocationTargetException e) {  
    e.printStackTrace();  
} catch (NoSuchMethodException e) {  
    e.printStackTrace();  

}  
}  
}  