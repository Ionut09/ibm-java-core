package com.ibm.java._1_intro;

import java.nio.charset.Charset;

//com.ibm.java._1_intro.Primitives -> fully qualified name of the class, tb sa fie unic pe classpath
public class Primitives {
	
	public static void main(String[] args) {
		//		String
		int a = 22;
		
		var b = 33; //int
		//		b = true;
		b = a;
		b = 4;
		
		System.out.println(7 / 2); // 3
		System.out.println(7 / 2.0); // 3.5
		
		//		Integer.MAX_VALUE
		long bigNumber = 2147483647;
		//		bigNumber = 2147483648; => Integer number too large
		bigNumber = 214748364899999L; //Integer number too large
		
		double realNumber = 3628.32;
		float realNumberFloat = 3628.3f; //F
		
		char c = 99;
		System.out.println(c);
		c = 'c';
		System.out.println(c);
		
		//		var c = 99;
		//		System.out.println(c);
		//		c = 'c'; //c va lua valoarea codului intreg al lui 'c'
		//		System.out.println(c);
		
		//		char firstChar = 'A';
		//		for (int i = 0; i < 26; i++) {
		//			System.out.println((char)(firstChar + i));
		//		}
		
		for (char i = 'A'; i <= 'z'; i++) {
			System.out.println(i);
		}
		
		char unicodeRepr = '\u0041'; //A
		System.out.println("unicodeRepr = " + unicodeRepr);
		
		double pow = Math.pow(2, 3);
		System.out.println(pow); //8
		Math.sqrt(16); //4
		
		int a1 = 2;
		int a2 = 2;
		//		System.out.println(a1++); //2
		//		System.out.println(a1);
		boolean result = a1++ > a2;  //false
		
		//		boolean result = ++a1 > a2;  //true
		System.out.println("result = " + result);
		
		boolean t = true; //1
		boolean f = false; //0
		System.out.println(t && f); //false
		System.out.println(t || f); //true
		System.out.println(!t); //false
		System.out.println(!f); //true
		
		a1 = 2;
		a2 = 2;
		boolean complexOperation = (a1 < a2) && (--a1 > ++a2); //false && x = false
		System.out.println("complexOperation = " + complexOperation);
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		
		//		int i = 2 & 3; //merge
		String str = "My name is Ionut";
		str = null;
		if ((str != null) && (str.length() > 0)) {
			System.out.println(str.toUpperCase());
		} else {
			System.out.println("The string empty or null");
		}
		
		int[] values = {1, 2, 2, 3};
		
		values = new int[]{1, 2, 2, 3};
		
		System.out.println(2/3.0 == 0.66666666666666666777); //true
		System.out.println(0.666666666666666666 * 0.6666666666666666);
		
		for (Charset charset : Charset.availableCharsets()
		                             .values()) {
			System.out.println(charset);
		}
		
		float[] valuess = new float[5]; //12555 + index * 32 (storage of float) -> pozitia unui element din array
		for (float i : valuess) {
			System.out.println("i = " + i);
		}
	}
}
