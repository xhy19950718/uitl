package com.utils.StreamUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtil {

	
	/**
	 * 关流
	 * @param autoCloseables
	 */
	public static void closeStream(AutoCloseable...autoCloseables) {
		if(autoCloseables!=null) {
			for (AutoCloseable autoCloseable : autoCloseables) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					System.err.println("close");
					// TODO: handle exception
				}
			}
		}
	}
	//读取文件内容
	public static String getFileTextContent(InputStream is) {
		byte[] b=new byte[1024];
		String str = null;
		try {
			while (is.read(b)!=-1) {
				str+=new String(b);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeStream(is);
		}
		return str;
	}
	//重载
	public static String getFileTextContent(File file) {
		InputStream is=null;
		try {
			is=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getFileTextContent(is);
	}
	
	

	
}
