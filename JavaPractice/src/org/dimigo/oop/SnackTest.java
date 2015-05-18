/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ SnackTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 18.
 * </pre>
 *
 * @author			 : hd132634
 * @version			 : 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Snack[] snackArr = {
				new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칲", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4)
		};
		int sum = 0;
		for(Snack snack:snackArr) {
			System.out.println("이름 : " + snack.getName());
			System.out.println("제조사 : " + snack.getCompany());
			System.out.println("가격 : " + String.format("%,d", snack.getPrice()));
			System.out.println("개수 : " + snack.getNumber() + "개");
			sum += snack.calcPrice();
		}
		
		System.out.println("총 구매 금액 : " + String.format("%,d", sum) + "원");
	}

}
