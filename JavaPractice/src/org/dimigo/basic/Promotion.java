package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		long salary = 1700000L;
		int ppl = 3;
		int shop = 1500;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.print("월 평균 급여 : " + String.format("%,d원\n", salary));
		System.out.print("점포내 직원수 : " + ppl + "명" + "\n");
		System.out.print("점포 수 : " + String.format("%,d개\n", shop));
		System.out.println("\n");
		System.out.print("연간 인건비 : " + String.format("%,d원\n", (long)salary*12*ppl*shop));
	}

}
