package com.coderlong;
/***
 * 
 * 
 * <p>Title:</p>
 * <p>Description:javabean </p>
 * <p>Company:</p> 
 * @author codeÁú
 * @date
 * @version 1.0
 */
public class testReflect {
	public String str1 = "ball";
	public String str2 = "basketball";
	public String str3 = "sailong";
	private int a;
	public int b;

	public testReflect(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		testReflect other = (testReflect) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

	public String toString() {
		return "str1:" + str1 + "   str2:" + str2 + "   str3:" + str3;
	}

}
