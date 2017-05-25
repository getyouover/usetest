/**
 * 
 */
package com.jit.training.three.choice_student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author JIT_LiangR
 *you can leave up you set
 *         2017年4月18日 下午9:42:18
 */
public class InputTxt {
	
	
	private File file;
	private FileReader fr;
	private BufferedReader br;
	
	/**
	 * @throws FileNotFoundException 
	 * 
	 */
	public InputTxt(String fileDir) throws FileNotFoundException {
		this.file = new File(fileDir);	//"src//txt//students.txt"
		//this.fileStu = new File(fileSDir);//"result_student.txt"
		this.fr = new FileReader(file);
		//this.fSr = new FileReader(fileStu);
		this.br = new BufferedReader(fr);
		//this.bSr = new BufferedReader(bSr);
	}
	/**
	 * 读取文件中的内容并将它连接成字符串返回出来。
	 * @return
	 * @throws IOException
	 */
	public String readTxt() throws IOException {
		String studentsName = "";
		String temp = "";
		boolean flag = true;
		while(flag){
			temp = br.readLine();
			if(temp!=null){
				studentsName +=temp.trim();
			}else{
				break;
			}
		}
		br.close();
		return studentsName;
	}
	
	/**
	 * 获取结果文件的所有信息，以字符串的形式返回
	 * @return
	 * @throws IOException
	 */
	public String readSTxt()throws IOException{
		String resultStudentName ="";
		String temp = "";
		boolean flag =true;
		while(flag){
			temp = br.readLine();
			if (temp != null){
				resultStudentName +=temp.trim();
			}else{
				break;
			}
		}
		
		br.close();
		return resultStudentName;
	}
	
	/*public static void main(String[] args) {
		try {
			new InputTxt().readTxt();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

}
