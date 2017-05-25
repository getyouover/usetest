/**
 * 
 */
package com.jit.training.one.math.util;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

import com.jit.training.one.math.client.MathClient;
import com.jit.training.one.math.service.MathService;

/**
 * 
 * @author JIT_LiangR
 *
 *         2017年4月17日下午10:15:27
 */
public class DefitionIO {

	private double a, b;
	private String mod, string;
	private double result;// save the result operation
	private MathIOFile mwf = new MathIOFile();

	/**
	 * 获取数值
	 * 
	 * @return
	 */
	public double inputValueDouble() {
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}

	/**
	 * 获取本地时间 区别输入
	 */
	public void time() {
		

	}
	/**
	 * 获取评价分数
	 * @return
	 */
	public float GetSroce(){
		Scanner sc = new Scanner(System.in);
		return sc.nextFloat();
	}
	/**
	 * 获取控制台输入的评价信息
	 * @return
	 */
	public String GetTip(){
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	/**
	 * 获取运算符
	 * 
	 * @return
	 */
	public String inputValueString() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	/**
	 * 输入数据和运算符 计算
	 */
	public void inputtwo() {
		Date date = new Date();//定义时间
		DateFormat dt = DateFormat.getDateTimeInstance();//格式化时间
		string = dt.format(date);//字符串接收
		MathService ms = new MathService();
//		threadname = Thread.currentThread().getName();
		System.out.println("please input the a:");
		a = this.inputValueDouble();
		System.out.println("please input the operator(+,-,*,/):");
		mod = this.inputValueString();
		System.out.println("please input the b:");
		b = this.inputValueDouble();
		result = ms.Maths(a, b, mod);
		Filew(string,a,b,mod,result);
	}

	/**
	 * 输出计算结果
	 */
	public void printValue() {
		// result = ms.getReslut();
		System.out.println("结果为:" + result);
	}
	/**
	 * 写入文件
	 * @param threadname
	 * @param date
	 * @param a
	 * @param b
	 * @param mod
	 * @param result
	 * @throws IOException
	 */
	public void Filew( String date, double a, double b, String mod, double result)
			{
		try{
		mwf.FileWriteTest(date, a, b, mod, result);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * 获取线程名称
	 *//*
	public void getname(){
		MathClient mc = new MathClient();
		this.threadname = mc.threadname;
	}*/
	/**
	 * 读文件
	 */
	public void readFile(){
		mwf.readFile();
	}
}
