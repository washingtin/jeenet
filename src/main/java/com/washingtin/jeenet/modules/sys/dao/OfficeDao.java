package com.washingtin.jeenet.modules.sys.dao;

import com.washingtin.jeenet.common.persistence.TreeDao;
import com.washingtin.jeenet.common.persistence.annotation.MyBatisDao;
import com.washingtin.jeenet.modules.sys.entity.Office;

/**
 * 描述：机构DAO接口
 * @author jeenet
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office>{

}
