package com.coderlong;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.print.attribute.standard.PDLOverrideSupported;

/***
 * 
 * 
 * <p>Title:</p>
 * <p>Description:内省的测试代码 </p>
 * <p>Company:</p> 
 * @author code龙
 * @date
 * @version 1.0
 */
public class introSpect_test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		testReflect testReflect = new testReflect(3, 6);
		
		String propertyName = "a";
		Object object = getproperty(testReflect, propertyName);//重构了此方法refactor
		System.out.println(object);
		setproperty(testReflect, propertyName);//重构了 此方法
		System.out.println(testReflect.getA());
		

	}

	private static void setproperty(Object ob, String propertyName)
			throws IntrospectionException, IllegalAccessException,
			InvocationTargetException {
		PropertyDescriptor propertyDescriptor2 = new PropertyDescriptor(propertyName, ob.getClass());
		Method methodSetA = propertyDescriptor2.getWriteMethod();
		Object cbObject = methodSetA.invoke(ob, 7);
	}

	private static Object getproperty(Object ob,
			String propertyName) throws IntrospectionException,
			IllegalAccessException, InvocationTargetException {
		PropertyDescriptor propertyDescriptor = new PropertyDescriptor(propertyName, ob.getClass());
		Method methodGetA =  propertyDescriptor.getReadMethod();
		Object object = methodGetA.invoke(ob);
		return object;
	}

}
