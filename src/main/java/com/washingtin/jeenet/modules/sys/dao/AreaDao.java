package com.washingtin.jeenet.modules.sys.dao;

import com.washingtin.jeenet.common.persistence.TreeDao;
import com.washingtin.jeenet.common.persistence.annotation.MyBatisDao;
import com.washingtin.jeenet.modules.sys.entity.Area;

/**
 * 描述：区域DAO接口
 * @author jeenet
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area>{

}
