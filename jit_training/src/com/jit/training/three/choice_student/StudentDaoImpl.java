/**
 * 
 */
package com.jit.training.three.choice_student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import org.apache.log4j.Logger;

/**
 * @author JIT_LiangR
 *
 * 2017年4月18日 下午10:58:14
 */
public class StudentDaoImpl implements StudentDao{

	private InputTxt it= null;
	private InputTxt itS= null;
	private Map<String,String> maps = new TreeMap<String,String>();
	private Map<String,String> mapStu = new TreeMap<String,String>();
	private Map<String,String> mapRest = new TreeMap<String,String>();
	private Logger log =Logger.getLogger(StudentDaoImpl.class);
	String []testS,resultS,list,num,name;
	
	/**
	 * 
	 */
	public StudentDaoImpl(String fileDir,String fileSDir) {
		try {
			this.it = new InputTxt(fileDir);
			this.itS = new InputTxt(fileSDir);
		} catch (FileNotFoundException e) {
			log.error("not found file!");
			e.printStackTrace();
		}
	}


	/* (non-Javadoc)
	 * @see com.jit.training.three.choice_student.StudentDao#getAllStudents()
	 */
	@Override
	public Map<String, String> getAllStudents() {
		String sname="";
		try {
			sname=it.readTxt();
		} catch (IOException e) {
			log.error("未找到指定的文件...");
		}
		String []student=sname.split(";");
		String[] t =new String[2];
		for(String str:student){
			t = str.split(",");
			maps.put(t[0].trim(), t[1].trim());
		}
		return maps;
	}
	/**
	 * 获取已经被抽取的学员名单
	 */
	@Override
	public Map<String, String> getResultStudent() {
		// TODO Auto-generated method stub
		String resultStu = "";
		
		try {
			resultStu = itS.readSTxt();
			
			if(resultStu==null){
				log.info("提示：结果文件为空，还没有同学被选中哦~~~");
				log.debug("操作文件为空~~~~~~");
				mapStu =null;
				return mapStu;
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.info("not found the file");
		}
		
		resultS = resultStu.split(";");//将获取的信息以;为分割存入字符串数组中
		String []t =new String[2];//此数组用来存储已经在结果文件中的学员序号和姓名
		for(int i = 0;i < resultS.length;i++){
			testS=resultS[i].split(",");
			/*for(String st :testS){
				System.out.println(st);
			}*/
			for(int j = 0;j<2;j++){
				while(j==0){
					num =testS[0].split(":");
					t[0]=num[1].trim();
					//System.out.println("t[0]:"+t[0]);
					break;
				}
				while(j==1){
					name = testS[j].split(":");
					t[1]=name[1].trim();
					//System.out.println("t[1]:"+t[1]);
					break;
				}
				if (t[0]!=null&&t[1]!=null){
					mapStu.put(t[0].trim(), t[1].trim());
				}
			}
			/*list=testS[j].split(":");
				while(j==0){
					t[0]=list[1];
					System.out.println(t[0]);
				}
				while(j==1){
					t[1]=list[1];
					System.out.println(t[1]);
					mapStu.put(t[0].trim(), t[1].trim());
				}
				
			}	
			System.out.println("neirong:"+t[0]+"fsdfsd"+t[1]);*/
		}		
		return mapStu;
		
	}
		
		
	/*
	 * 比较两个map，将map中不同的也就是剩余的学员放入mapRest返回
	 * (non-Javadoc)
	 * @see com.jit.training.three.choice_student.StudentDao#restStudent(java.util.Map, java.util.Map)
	 */
	
	@Override
	public Map<String, String> restStudent(Map<String, String> map1, Map<String, String> map2) {
		// TODO Auto-generated method stub
		//map1是学生名单中的所有人，map2是已经被选中的学生
		
		if(map2.isEmpty()){
			log.debug("没有已经被选中的人");
			return map1;
		}else{
		
		for(Entry<String, String> temp:map1.entrySet()){
			boolean flag =false;
			for(Entry<String, String> temp1:map2.entrySet()){
				if(temp.getKey().equals(temp1.getKey())&&temp.getValue().equals(temp1.getValue())){
					flag = false;
					//System.out.println("xiang deng:"+temp.getKey()+":"+temp1.getKey()+";"+temp.getValue()+":"+temp1.getValue());
					break;
				}else{
					flag = true;
					//System.out.println("bu xiang deng:"+temp.getKey()+":"+temp1.getKey()+";"+temp.getValue()+":"+temp1.getValue());
					continue;
				} 
			}
			if(flag){
				String key = temp.getKey();
				String value = temp.getValue();
				mapRest.put(key.trim(), value.trim());
			}
		}
		
		return mapRest;
	}
}
	/**
	 * 
	 * @param src
	 * @param separator
	 * @return String[]
	 */
	public String[] getSplitArrayToString(String src,String separator){
		String [] temp = src.split(separator);
		return temp;
	}
	/**
	 * 
	 * @param src
	 * @param separator
	 * @return
	 */
	public List<String> getSplitArrayToList(String src,String separator){
		List<String> lists =new ArrayList<>();
		String [] temp = src.split(separator);
		for(int i=0;i<temp.length;i++){
			lists.add(temp[i]);
		}
		return lists;
	}

}
