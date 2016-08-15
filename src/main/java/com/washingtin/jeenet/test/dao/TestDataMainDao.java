package com.washingtin.jeenet.test.dao;

import com.washingtin.jeenet.common.persistence.CrudDao;
import com.washingtin.jeenet.common.persistence.annotation.MyBatisDao;
import com.washingtin.jeenet.test.entity.TestDataMain;

/**
 * 主子表生成DAO接口
 * @author jeenet
 */
@MyBatisDao
public interface TestDataMainDao extends CrudDao<TestDataMain> {
	
}