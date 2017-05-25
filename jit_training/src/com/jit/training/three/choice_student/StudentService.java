/**
 * 
 */
package com.jit.training.three.choice_student;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;

import com.jit.training.one.math.util.ResultFile;

/**
 * @author JIT_LiangR
 *
 *         2017年4月18日 下午11:00:46
 */
public class StudentService {

	private StudentDao studentDao;
	private String fileDir = "student_list.txt";
	private String fileSDir = "result_student.txt";
	private Student student;
	private List<Student> students, stu;
	private ResultFile rf1;
	
	/**
	 * 
	 */
	public StudentService() {
		this.studentDao = new StudentDaoImpl(fileDir,fileSDir);
		this.students = new ArrayList<>();
		this.rf1 = new ResultFile();
	}

	/**
	 * 
	 */
	public Student choiceStudent() {
		int size = students.size();
		int counter = ThreadLocalRandom.current().nextInt(size);
		// String name = students.get(counter-1).get姓名();
		student = students.get(counter - 1);
		System.out.println("目前学员数量： " + students.size());
		students.remove(counter - 1);
		stu = students;// 将进行删除操作后的list给stu
		return student;
	}

	/**
	 * 获取完成删除的list
	 * 
	 * @return
	 */
	public List<Student> getStu() {
		return this.stu;// 将获得的list返回
	}

	/**
	 * 
	 * @param maps
	 * @return
	 */
	public void convertMapToList(Map<String, String> maps) {
		Student stu = null;
		for (Entry<String, String> temp : maps.entrySet()) {

			stu = new Student();
			stu.set序号(temp.getKey());
			stu.set姓名(temp.getValue());
			students.add(stu);

		}
	}

	public void FinallMapToList() {

	}
	
	public Map<String, String> getAllStudent(){
		return this.studentDao.getAllStudents();
	}

	/**
	 * 得到剩余学生信息的map
	 * @return
	 */
	public Map<String, String> getStudents() {
		return this.studentDao.restStudent(this.studentDao.getAllStudents(), this.studentDao.getResultStudent());
		/*return this.studentDao.getAllStudents();
		return this.studentDao.getResultStudent();*/
	}
}
