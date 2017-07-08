package com.demo.project;

import com.demo.Logger.Logger;

public class LoggerDemo {

	public static void main(String[] args) {
		
		final Logger log = Logger.getLogger(LoggerDemo.class);
		for(int i=0; i<=10; i++){
			log.debug("index:" +i);
		}

	}

}
