/**
 * 
 */
package com.jit.training.three.choice_student;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jit.training.one.math.util.ResultFile;

/**
 * @author JIT_liangR
 *
 *         2017年4月18日 下午11:46:04
 */
public class StudentServiceTest {
	
	private StudentService ss;
	private Student student;
	private String choicedName;
	private ResultFile rf;
	//private File file;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ss = new StudentService();
		rf = new ResultFile();
		//file = new File("student_list.txt");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("整个游戏结束，请大家期待下一次的快乐猜猜猜！");
		System.out.println("此次活动由华钦和金陵科技联合制作！");
	}

	/**
	 * Test method for
	 * {@link com.jit.training.three.choice_student.StudentService#choiceStudent()}.
	 */
	@Test
	public void testChoiceStudent() {
		String controller = "y";
		ss.convertMapToList(ss.getStudents());
		while (controller.equals("y")) {
			System.out.println("开始由JVM - 大神 选出 鸿运当头 者：");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			student= ss.choiceStudent();
			
			choicedName = student.get姓名();
			System.out.println("大神正在紧张的选择中...而同学们正在热切的期待中...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("中选者是： " + choicedName);
			System.out.println("恭喜" + choicedName + "同学请上讲台！");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//rf.updateSliste(file, ss.getStu());
			rf.MakeTip(student);
			System.out.println("准备开始选择下一轮游戏：y or n");
			Scanner sc =new Scanner(System.in);
			controller=sc.next();
		}

		
	}

	/**
	 * Test method for
	 * {@link com.jit.training.three.choice_student.StudentService#getStudents()}.
	 */
	@Test
	public void testGetStudents() {
		Map<String, String> maps = ss.getStudents();
		Iterator<Entry<String, String>> iter = maps.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry) iter.next();
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " " + val);
		}
		// 多线程java.lang.ThreadLocal的实例
		//System.out.println(ThreadLocalRandom.current().nextInt(32));
	}

}
