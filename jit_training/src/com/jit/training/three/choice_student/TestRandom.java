/**
 * 
 */
package com.jit.training.three.choice_student;

import java.util.HashSet;
import java.util.Set;

/**
 * @author JIT_LiangR
 *
 */
public class TestRandom {

	int [] students =new int[32];
	
	public void createdNameLists(){
		Set sets = new HashSet();
	}
	
	
	public void getTotalPerson(String count){
		int counter = Integer.parseInt(count);
		System.out.println("in process......");
		System.out.println("choice people: "+(int)(Math.random()*counter));
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestRandom().getTotalPerson("32");

	}

}
