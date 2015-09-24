/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * 		|_ AgeCheckException
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author			 : hd132634
 * @version			 : 1.0
 */
public class AgeCheckException extends Exception {

	public AgeCheckException(){}
	
	public AgeCheckException(Movie movie) {
		System.out.println(movie.getTitle() + "은/는 " + movie.getLimitAge() + "세 이상 관람가 입니다.");
	}
}
