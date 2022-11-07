package com.te.javalogger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class JavaLoggerDemo {
	private final static Logger LOGGER = Logger.getLogger(JavaLoggerDemo.class.getName());

	public static void main(String[] args) {
		LOGGER.info("hello");
		ConsoleHandler consoleHandler=new ConsoleHandler();
		consoleHandler.setLevel(Level.ALL);
		
//		SimpleFormatter simpleFormatter=new SimpleFormatter();
//		consoleHandler.setFormatter(simpleFormatter);
		
		LOGGER.addHandler(consoleHandler);
		LOGGER.setLevel(Level.ALL);
		LOGGER.severe("severe");
		LOGGER.warning("warning");
		LOGGER.info("info");
		LOGGER.config("config");
		LOGGER.fine("fine");
		LOGGER.finer("finer");
		LOGGER.finest("finest");
		
		
		
	}
}
