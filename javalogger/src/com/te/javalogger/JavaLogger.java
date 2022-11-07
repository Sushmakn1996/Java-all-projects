package com.te.javalogger;

import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.LoggingMXBean;

public class JavaLogger{
	
	private final static Logger LOGGER = Logger.getLogger(JavaLoggerDemo.class.getName());

	public static void main(String[] args) throws SecurityException, IOException {

		FileHandler fileHandler = new FileHandler("F:\\loggingfiles\\Log.txt");
		fileHandler.setLevel(Level.ALL);

		MyFormat myFormat = new MyFormat();
		fileHandler.setFormatter(myFormat);

		LOGGER.addHandler(fileHandler);
		LOGGER.severe("severe");
		LOGGER.warning("warning");
		LOGGER.info("info");
		LOGGER.config("config");
		LOGGER.fine("fine");
		LOGGER.finer("finer");
		LOGGER.finest("finest");
	}
}
