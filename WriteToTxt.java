package com.java.IO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * ������Ա�û���������д���ļ�
 */
import com.java.model.User1;

public class WriteToTxt {
	public void writeToTxt(String path,String userName,String password) {
		 try {
	            File file = new File(path);
	            PrintStream ps = new PrintStream(new FileOutputStream(file));
	            ps.println(userName);// ���ļ���д���ַ���
	            ps.append(password);
	          
	        } catch (FileNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}
	
	
}
