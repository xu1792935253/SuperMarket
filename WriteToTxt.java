package com.java.IO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * 将管理员用户名，密码写入文件
 */
import com.java.model.User1;

public class WriteToTxt {
	public void writeToTxt(String path,String userName,String password) {
		 try {
	            File file = new File(path);
	            PrintStream ps = new PrintStream(new FileOutputStream(file));
	            ps.println(userName);// 往文件里写入字符串
	            ps.append(password);
	          
	        } catch (FileNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}
	
	
}
