package com.washingtin.jeenet.modules.gen.dao;

import com.washingtin.jeenet.common.persistence.CrudDao;
import com.washingtin.jeenet.common.persistence.annotation.MyBatisDao;
import com.washingtin.jeenet.modules.gen.entity.GenTable;

/**
 * 描述：业务表DAO接口
 * @author jeenet
 */
@MyBatisDao
public interface GenTableDao extends CrudDao<GenTable> {

}
