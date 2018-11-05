package com.liu.ProceDure.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	/**
	 * 
	 * @Title: proceDureDelete @Description: 储存过程删除测试 @param 参数 @return String
	 * 返回类型 @throws
	 */
	@GetMapping("/proceDureDelete")
	public String proceDureDelete() {
		proceSureService.cascadeOperation();
		return "存储过程删除测试";
	}

	@GetMapping("/selectProceDure")
	public String selectProceDure() {
		Map<String, Object> mm = new HashMap<String, Object>();
		mm.put("fid", "2018-11-05-02");
		mm.put("sex", "女");
		mm = proceSureService.queryUser(mm);

		return "存储过程删除测试";
	}

}
