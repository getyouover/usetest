/**
 * 
 */
package com.jit.training.one.math.dao;

/**
 * 
 * @author JIT_LiangR
 *
 * 2017年4月17日下午10:14:36
 */
 
public interface MathDao {
	/**
	 * 
	 * @param 变量a的值
	 * @param 变量b的值
	 * @return a+b的值
	 */
	public double add(double a,double b);
	/**
	 * 
	 * @param a
	 * @param b
	 * @return a-b
	 */
	public double minus(double a,double b);
	/**
	 * 
	 * @param a
	 * @param b
	 * @return a*b
	 */
	public double mul(double a,double b);
	/**
	 * 
	 * @param a
	 * @param b
	 * @return a/b
	 */
	public double div(double a,double b);
}
