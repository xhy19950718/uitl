package com.utils.fileUtil;

import java.io.File;

public class FileUtil {
	//获取拓展名
	public static String getSuffix(String fileName) {
		String[] split = fileName.split("\\.");
		int length = split.length;
		if(length==1) {
			return "该文件无拓展名";
		}
		return split[length-1];
		
		
		
	}
	
	
	public static String getSuffix(File file) {
		String suffix = getSuffix(file.getName());
		return suffix;
	}
	
	
}
