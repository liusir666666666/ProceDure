package com.liu.ProceDure.dao.proceDureMaster;

import java.util.Map;

import com.liu.ProceDure.entity.PUser;
import com.liu.ProceDure.mapperUtils.MyMapper;

public interface PUserMapper extends MyMapper<PUser> {
	/**
	 * 
	* @Title: cascadeOperation
	* @Description: 存储过程删除测试
	* @param     参数
	* @return void    返回类型
	* @throws
	 */
	void cascadeOperation();
	
	Map<String, Object> testPuser(Map<String, Object> param);
	
}