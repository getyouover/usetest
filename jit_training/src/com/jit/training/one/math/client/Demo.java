package com.jit.training.one.math.client;

import com.jit.training.one.math.util.DefitionIO;

public class Demo {
	public static void main(String[] args) {
		MathClient m1=new MathClient();
		Thread user1 = new Thread(m1);
		user1.setName("user1");
		Thread user2 = new Thread(m1);
		user2.setName("user2");
		Thread user3 = new Thread(m1);
		user3.setName("user3");
		Thread user4 = new Thread(m1);
		user4.setName("user4");
		 user1.start();
		 user2.start();
		 user3.start();
		 user4.start();	
		
	}
}
