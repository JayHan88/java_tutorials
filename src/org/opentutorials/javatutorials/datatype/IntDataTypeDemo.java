package org.opentutorials.javatutorials.datatype;

public class IntDataTypeDemo {

	public static void main(String[] args) {
		byte a;
		a= 127;
		System.out.println(a);
		
		short b;
		int c;
		b = 32767;
		c = 32768;
		System.out.println(b);
		System.out.println(c);
		
		long d;
		d = 999999999;
		System.out.println(d);
		
		int x = 2147483647; 
		long y = 214748647;
		//x와 y는 똑같은 수를 저장하고 있지만, 변수 y가 변수 x 대비 2배의 메모리를 사용한다. 데이터 타입이 다르기 때문이다.
		

	}

}
