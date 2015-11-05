/**
 * 
 */
package org.dimigo.thread;

import java.util.Random;

/**
 * <pre>
 * org.dimigo.thread
 * 		|_ Runner
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 5.
 * </pre>
 *
 * @author			 : hd132634
 * @version			 : 1.0
 */
public class Runner extends Thread {
	
	private String name;
	
	public Runner(String name) {
		this.name = name;	
	}
	
	public void run() {
		
				System.out.println(name + " 출발");
				System.out.println();
				
				for(int i=10; i>=0; i--) {
					System.out.println(name+ " " + i*10 + " 미터");
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(name + " 골인");
	}
}