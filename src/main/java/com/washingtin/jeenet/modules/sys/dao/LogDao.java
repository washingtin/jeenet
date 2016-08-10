package com.washingtin.jeenet.modules.sys.dao;

import com.washingtin.jeenet.common.persistence.CrudDao;
import com.washingtin.jeenet.common.persistence.annotation.MyBatisDao;
import com.washingtin.jeenet.modules.sys.entity.Log;

/**
 * 描述：日志DAO接口
 * @author jeenet
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log>{

}
