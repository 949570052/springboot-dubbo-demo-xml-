package com.xdclass.user.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@EnableAutoConfiguration
//xml°æ±¾¼Óimport..
@ImportResource("provider.xml")
public class ServiceAppliaction {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceAppliaction.class, args);
	}

}
