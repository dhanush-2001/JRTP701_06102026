package com.nt;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Service {
	
	@Bean("wmg")
	public Date sum() {
		return new Date();
	}
	
}
