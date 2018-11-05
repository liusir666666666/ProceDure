package com.liu.ProceDure.service;

import java.util.List;
import java.util.Map;

import com.liu.ProceDure.entity.PUser;


public interface ProceSureService {
	List<PUser> findAll();
	
	void cascadeOperation();
	
	Map<String, Object> queryUser(Map<String, Object> paraMap);
}
