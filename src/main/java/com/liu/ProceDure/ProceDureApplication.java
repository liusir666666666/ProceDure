package com.liu.ProceDure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.liu.ProceDure.dao")
public class ProceDureApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProceDureApplication.class, args);
	}
}
