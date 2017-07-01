package com.test;

import java.io.File;
import java.io.FileInputStream;

public class SimpleTest {


	public static void main(String[] args) {
		File file = new File("G:/最后结果.txt");
		File file2 = new File("G:/最后结果2.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			byte[] temp = new byte[(int) file.length()];
			fis.read(temp);
			String result = new String(temp);
			
			FileInputStream fis2 = new FileInputStream(file2);
			byte[] temp2 = new byte[(int) file.length()];
			fis2.read(temp2);
			String result2 = new String(temp2);
			
			System.out.println(result.equals(result2));
			fis.close();
			fis2.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
