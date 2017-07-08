package com.demo.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
	static String className = "defualt";
	public static Logger getLogger(Class<?> classFile){
		String className = classFile.getName();
		return new Logger(className);
		
	}
	Logger(String className){
		this.className = className;
	}
	public static void debug(Object log){
		Date dt = new Date();
		StringBuilder Log = new StringBuilder();
		Log.append("Log ").append(Logger.className).append(" ").append(dt).append(" ").append(log).append("\n");
		System.out.println(Log.toString());
		write(Log.toString());
		
	}
	static void write(String str){
		BufferedWriter writer= null;
		try {
			 writer = new BufferedWriter(new FileWriter("Log.log",true));
			writer.append(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
		    try
		    {
		        if ( writer != null)
		        writer.close( );
		    }
		    catch ( IOException e)
		    {
		    }
		}

	}

	

}
