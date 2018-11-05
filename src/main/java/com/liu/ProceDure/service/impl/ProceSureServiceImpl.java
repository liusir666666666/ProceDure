package com.liu.ProceDure.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liu.ProceDure.dao.proceDureMaster.PUserMapper;
import com.liu.ProceDure.entity.PUser;
import com.liu.ProceDure.service.ProceSureService;

@Service
public class ProceSureServiceImpl implements ProceSureService {

	@Autowired
	private PUserMapper puserMapper;

	@Override
	public List<PUser> findAll() {
		List<PUser> reList = puserMapper.selectAll();
		return reList;
	}

}
