/**
 * 
 */
package com.jit.training.three.choice_student;

import java.util.HashMap;
import java.util.Map;

/**
 * @author JIT_LiangR
 *
 * 2017年4月18日 下午10:57:57
 */
public interface StudentDao {

	/**
	 * 获取所有的学员信息
	 * @return List<Student> 返回集合对象
	 */
	public Map<String, String> getAllStudents();
	/**
	 * 获取所有已经上台的学员信息
	 * @return List<Student> 返回集合对象
	 */
	public Map<String, String> getResultStudent();
	/**
	 * 获取未选中的剩余部分的学员信息
	 * @return List<Student> 返回集合对象
	 */
	public Map<String, String> restStudent(Map<String, String>map1 ,Map<String, String> map2);
	
}
