package com.coderlong;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.Null;

public class testclass {
	private int a;
	private int b;

	public testclass(int... args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

	public static void main(String[] args) throws Exception {
		// testclass c1 = new testclass(1,2,5,4,6);
		// ���Է�����ĳ�Ա ������˽�еĳ�Ա �� ���еĳ�Ա ˽�еĳ�Ա����ķ��� ��Ҫ���ñ�������ģ�
		System.out.println("���Է�����ĳ�Ա ������˽�еĳ�Ա �� ���еĳ�Ա ˽�еĳ�Ա����ķ��� ��Ҫ���ñ�������ģ�");
		testReflect reflect = new testReflect(4, 5);
		Field fieldB = reflect.getClass().getField("b");
		System.out.println(fieldB.get(reflect));
		Field fieldA = reflect.getClass().getDeclaredField("a");
		fieldA.setAccessible(true);
		System.out.println(fieldA.get(reflect));

		// ���Է���ĸ߼�����
		System.out.println("//���Է���ĸ߼����� ");
		System.out.println(reflect);
		changeStringValue(reflect);

		System.out.println(reflect);

		// ��������ķ���Ӧ��
		System.out.println("//��������ķ���Ӧ��");
		int[] a1 = new int[5];
		int[] a2 = new int[4];
		System.out.println("dddddddddddddddddddddddd");
		System.out.println(a1);
		System.out.println(a1.getClass() == a2.getClass());
		int[][] a3 = new int[2][3];
//		Class<>
		
//		String[] a4 = new String[2];
		
//		System.out.println(a3.getClass() == a4.getClass());
//		System.out.println(a4);
		System.out.println(Arrays.asList(a1));
//		System.out.println(Arrays.asList(a4));
		Object object1 = null;
//		System.out.println(object1);
		printObject(object1);
		
		
		//����ö�����͵Ĳ���
		System.out.println("//����ö�����͵Ĳ���");
		
	}

	private static void printObject(Object object1) {
		
		
	}

	private static void changeStringValue(Object object) throws Exception {
		Field[] fields = object.getClass().getFields();// �õ�object�����ֶε� �ֽ���
		for (Field field : fields) {
			if (field.getType() == String.class) {
				String oldValue = (String) field.get(object);
				String newValue = oldValue.replace('b', 'a');
				field.set(object, newValue);
			}
		}
	}

}
