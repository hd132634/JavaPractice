package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		System.out.println("<<고속도로 통행료 계산>>");
		String car = "고속버스";
		int s = 10;
		int a = (s - 10)/10;
		int m =850 +  a*300;
		if (s<=10)  {
		System.out.println("거리 : " + s + "km");
		System.out.println("차종 : 고속버스");
		System.out.println("통행료 : 850원");
		}
		else {
			System.out.println("거리 : " + s + "km");
			System.out.println("차종 : 고속버스");
			System.out.println("통행료 : " + m + "원");
		}
	}
}