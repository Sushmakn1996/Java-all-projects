package com.te.javalogger;

import java.sql.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyFormat extends Formatter {
	@Override
	public String format(LogRecord record) {
		return record.getSequenceNumber()+ " "+record.getLoggerName()+ " " + record.getSourceMethodName()+ "\n";
	}

}
