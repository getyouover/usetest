/**
 * 
 */
package com.jit.training.one.math.client;

import com.jit.training.one.math.service.MathService;
import com.jit.training.one.math.util.DefitionIO;

/**
 * 
 * @author JIT_LiangR
 *
 * 2017年4月17日下午10:15:06
 */
public class MathClient implements Runnable{
	
	
//	public String threadname;

	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	
	@Override
	public void run() {
		synchronized (MathService.class) {
		 
		DefitionIO date = new DefitionIO();
		date.inputtwo();
		date.printValue();
	}
	}
	
}
