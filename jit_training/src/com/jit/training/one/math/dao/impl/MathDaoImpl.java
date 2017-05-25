/**
 * 
 */
package com.jit.training.one.math.dao.impl;

import com.jit.training.one.math.dao.MathDao;

/**
 * 
 * @author JIT_LiangR
 *
 * 2017年4月17日下午10:14:53
 */
public class MathDaoImpl implements MathDao{

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double minus(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double mul(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double div(double a, double b) {
		// TODO Auto-generated method stub
		if(b!=0){
			return a / b;
		}else{
		
		return 1234567890;
		
		}
	}
	
}
