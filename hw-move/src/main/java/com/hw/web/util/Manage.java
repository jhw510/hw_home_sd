package com.hw.web.util;

import java.io.File;

public enum Manage {
 ADMIN_PATH,CSV,LIST,SUCCESS,FAIL,FILE_INSERT_ERROR,FILE_SELECT_ERROR;

	@Override
	public String toString() {
		String resultValue = "";
		switch(this) {
		case ADMIN_PATH : resultValue=
				"C:"+File.separator+"Users"+File.separator+"user"+File.separator+
				"git"+File.separator+"repository4"+File.separator+"hw-move"+File.separator+
				"src"+File.separator+"main"+File.separator+"java"+File.separator+
				"com"+File.separator+"hw"+File.separator+
				"web"+File.separator+"move"+File.separator; break;
		case CSV:resultValue = ".csv";break;	
		default:break;
		}
		return resultValue;
	}
	
}