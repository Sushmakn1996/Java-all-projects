package com.te.springcore.beananotation;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import lombok.Data;

@Data
public class Car implements Serializable {
	private String carName;
	private String carColor;

	@Autowired
	@Qualifier("engine2")
	private Engine engine;

}
