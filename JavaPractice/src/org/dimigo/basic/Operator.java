package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int a=9, b=10;
		float sh = 5.8f, ph = 5.4f;
		float s = ((a+b)*sh)/2;
		float p = a*ph;
		System.out.println("<<도형 넓이 비교>>");
		System.out.printf("사다리꼴 넓이 : %.1f\n", s);
		System.out.printf("평행사변형 넓이 : %.1f\n", p);
		System.out.println("\n");
		if(s>p) {
			System.out.printf("사다리꼴이 평생사변형 보다 %.1f 더 큽니다.", s-p);
		}
		else if (s<p) {
			System.out.printf("평행사변형이 사다리꼴 보다 %.1f 더 큽니다.", p-s);
		}

	}

}
