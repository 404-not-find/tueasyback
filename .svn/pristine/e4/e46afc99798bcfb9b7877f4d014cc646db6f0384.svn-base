package com.hiyun.tueasy.util;

import org.apache.commons.lang.StringUtils;

public class FileUtils {

	public static String renameName(String oldName,int index){
		if(StringUtils.isEmpty(oldName)){
			return "";
		}
		StringBuilder sb = new StringBuilder(StringUtils.substring(oldName, 0, oldName.lastIndexOf(".")));
		return sb.append(index).append(oldName.substring(oldName.lastIndexOf("."))).toString();
	}
}
