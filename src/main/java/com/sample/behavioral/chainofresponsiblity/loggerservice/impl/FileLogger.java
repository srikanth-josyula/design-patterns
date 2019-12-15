package com.sample.behavioral.chainofresponsiblity.loggerservice.impl;

import com.sample.behavioral.chainofresponsiblity.loggerservice.AbstractLogger;

public class FileLogger extends AbstractLogger {

	   public FileLogger(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("File::Logger: " + message);
	   }
	}