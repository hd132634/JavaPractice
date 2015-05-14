
package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		System.out.println("가장 좋아하는 가수는?");
		String answer;
		Scanner scanner = new Scanner(System.in);
		answer = scanner.nextLine();
		if("빅뱅".equals(answer)) {
			System.out.println("정답입니다!!^^");
		}
		else {
			System.out.println("틀렸습니다!!ㅠㅠ");
		}
		System.out.println();
		
		System.out.println("가장 좋아하는 배우는?");
		answer = scanner.nextLine();
		if("원빈".equals(answer)) {
			System.out.println("정답입니다!!^^");
		}
		else {
			System.out.println("틀렸습니다!!ㅠㅠ");
		}
		System.out.println();
		
		System.out.println("가장 좋아하는 과목은?");
		answer = scanner.nextLine();
		if("자바".equals(answer)) {
			System.out.println("정답입니다!!^^");
		}
		else {
			System.out.println("틀렸습니다!!ㅠㅠ");
		}
		scanner.close();
	}
}
