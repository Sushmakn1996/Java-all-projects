package com.te.java1;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class App {
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		LOGGER.fatal("Fatal Msg");
		LOGGER.error("Error Msg");
		LOGGER.warn("Warn Msg");
		LOGGER.info("Info Msg");
		
	}
	
}

