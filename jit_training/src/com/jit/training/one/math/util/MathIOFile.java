package com.jit.training.one.math.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MathIOFile {

	public void FileWriteTest(String date, double a, double b, String mod, double result) {
		try {
			File file = new File("info.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter write = new FileWriter(file.getName(), true);
			write.write(date + "Action:");
			write.write(a + "");// 规避特殊符号
			write.write(mod);
			write.write(b + "");// 规避特殊符号
			write.write("=");
			write.write(result + "\r\n");
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void readFile() {
		File file = new File("info.txt");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String str = null;
			int line = 1;

			while ((str = reader.readLine()) != null) {
				System.out.println("line" + line + ":" + str);
				line++;
			}
			reader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}
