package com.coderlong;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Properties;
/***
 * 
 * 
 * <p>Title:</p>
 * <p>Description: øÚº‹≈‰÷√Œƒº˛µƒº”‘ÿ ≤‚ ‘</p>
 * <p>Company:</p> 
 * @author code¡˙
 * @date
 * @version 1.0
 */
public class Reflect_test2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//InputStream fip = new FileInputStream("config.properties");
		InputStream fip = Reflect_test2.class.getClassLoader().getResourceAsStream("com/coderlong/config.properties");
		Properties properties = new Properties();
		properties.load(fip);
		fip.close();
		String	className = properties.getProperty("className1");
		System.out.println(className);
//		Collection collection = new HashSet();
		Collection collection = (Collection)Class.forName(className).newInstance();
		
		testReflect r1 = new testReflect(3, 3);
		testReflect r2 = new testReflect(3, 4);
		testReflect r3 = new testReflect(3, 3);
//		testReflect r4 = new testReflect(a, b)
		
		collection.add(r1);
		collection.add(r2);
		collection.add(r3);
		collection.add(r1);
		System.out.println(collection.size());
	}

}
