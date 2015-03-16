package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "아이유";
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char blood = 'A';
		
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : " + name);
		System.out.print("성별 : ");
		boolean 여자 = true;
		if(여자) {
				System.out.println("여자");
			} 
		System.out.println("나이 : " + age + "세");
		System.out.println("몸무게 : " + weight + "cm");
		System.out.println("혈액형 : " + blood + "형");
}
}
