/**
 * 
 */
package org.dimigo.oop;

import java.util.*;
/**
 * <pre>
 * org.dimigo.oop
 * 		|_ Score
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 *
 * @author			 : hd132634
 * @version			 : 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 => ");
		int scoreK = scanner.nextInt();
		
		System.out.print("수학 점수 입력 => ");
		int scoreM = scanner.nextInt();
		
		System.out.print("영어 점수 입력 => ");
		int scoreE = scanner.nextInt();
		
		System.out.println();
		
		int sum = scoreK + scoreM + scoreE;
		
		System.out.println("<<점수 출력>>");
		String sb = new StringBuilder()
		.append("국어 점수 : ")
		.append(scoreK)
		.append("점\n")
		.append("수학 점수 : ")
		.append(scoreM)
		.append("점\n")
		.append("영어 점수 : ")
		.append(scoreE)
		.append("점\n")
		.append("총점 : ")
		.append(sum)
		.append("점\n")
		.append("평균 : ")
		.append(String.format("%.1f", (float)sum/3.0))
		.append("점\n").toString();
		
		System.out.println(sb);
		scanner.close();
	}

}
