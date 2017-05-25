package com.jit.training.one.math.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;

import com.jit.training.three.choice_student.Student;

public class ResultFile {

	private DefitionIO df;
	private Student st;
	public ResultFile() {

		this.df = new DefitionIO();
	}

	/**
	 * 将学生序号，名字，分数，评价写入result_student.txt
	 * 
	 * @param name
	 * @param num
	 * @param sroce
	 * @param tip
	 */
	public void NoteTip(String name, String num, float sroce, String tip) {
		try {
			File file = new File("/jit_training/src/txt/result_student.txt");
			// if(!file.exists()){
			// file.createNewFile();
			// }
			FileWriter resultout = new FileWriter(file.getName(), true);
			resultout.write("序号:" + num + "," + "姓名:" + name + "," + "分数:" + sroce + "," + "评价:" + tip + ";" + " \r\n");
			resultout.close();
			System.out.println("谢谢您的做出的点评！！！！！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 获取控制台输入的评分以及评价
	 * 
	 * @param student
	 */
	public void MakeTip(Student student) {
		System.out.println("请为这个同学做出您的点评吧！！！");
		System.out.println("请输入您的评分：");
		float sroce = df.GetSroce();
		System.out.println("请输入您的评价：");
		String tip = df.GetTip();
		NoteTip(student.get姓名(), student.get序号(), sroce, tip);
	}

	/**
	 * 将已经把选出同学remove掉的list重新写入文件
	 * 
	 * @param file
	 * @param students
	 */
	public void updateSliste(File file, List<Student> students) {
		
		/*ObjectOutputStream os;
		try {
		if(!file.exists()){
				file.createNewFile();
			} 
		os = new ObjectOutputStream(new FileOutputStream(file));
		os.writeObject(students);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		FileWriter fl;
		try {
			fl = new FileWriter(file);
			/*Iterator<Student> iter = students.iterator();// 使用迭代器进行操作
			while (iter.hasNext()) {
				String str = iter.next().get序号() + "," + iter.next().get姓名() + ";";
				fl.write(str + "\r\n");
			}*/
			for(Student st:students){
				fl.write(st.get序号()+","+st.get姓名()+";"+"\r\n");
			}
			fl.flush();
			fl.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
