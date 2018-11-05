package com.liu.ProceDure.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liu.ProceDure.entity.PUser;
import com.liu.ProceDure.service.ProceSureService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/proceDure")
@Slf4j
public class ProceDureController {
	@Autowired
	private ProceSureService proceSureService;

	@GetMapping("/getUserInfo")
	public List<PUser> getUserInfo() {
		List<PUser> reList = proceSureService.findAll();
		log.info("这是结果啊。。。。", reList);
		return reList;
	}
}
