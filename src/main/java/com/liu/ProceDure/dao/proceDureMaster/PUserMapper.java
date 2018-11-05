package com.liu.ProceDure.dao.proceDureMaster;

import java.util.Map;

import com.liu.ProceDure.entity.PUser;
import com.liu.ProceDure.mapperUtils.MyMapper;

public interface PUserMapper extends MyMapper<PUser> {
	void cascadeOperation();
	Map<String, Object> queryUser(Map<String, Object> paraMap);
}