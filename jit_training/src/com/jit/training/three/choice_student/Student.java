/**
 * 
 */
package com.jit.training.three.choice_student;

import java.io.Serializable;

/**
 * @author JIT_LiangR
 *
 *         2017年4月18日 下午9:42:18
 */
public class Student implements Serializable {

	private String 序号;						//
	
	private String 姓名;						//

	public String get序号() {
		return 序号;
	}

	public void set序号(String 序号) {
		this.序号 = 序号;
	}

	public String get姓名() {
		return 姓名;
	}

	public void set姓名(String 姓名) {
		this.姓名 = 姓名;
	}

	@Override
	public String toString() {
		return "Student [序号=" + 序号 + ", 姓名=" + 姓名 + "]";
	}
	
	
	
}