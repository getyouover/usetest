/**
 * 
 */
package com.jit.training.one.math.service;

import com.jit.training.one.math.dao.impl.MathDaoImpl;
import com.jit.training.one.math.util.DefitionIO;

/**
 * 
 * @author JIT_LiangR
 *
 * 2017年4月17日下午10:15:18
 */
public class MathService {
	
	
	private MathDaoImpl math = new MathDaoImpl();
	private double a,b;
	private String mod;
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	private double sum;
	
	/*public void setMath(MathDaoImpl math) {
		this.math = math;
	}*/
	public double Maths(double a,double b,String mod){
		
		switch(mod){
		case"+":
			sum =this.math.add(a, b);
			break;
		case"-":
			sum=this.math.minus(a, b);
			break;
		case"*":
			sum =this.math.mul(a, b);
			break;
		default:
			sum =this.math.div(a, b);
		
		}
	return sum;
	}
	
}
