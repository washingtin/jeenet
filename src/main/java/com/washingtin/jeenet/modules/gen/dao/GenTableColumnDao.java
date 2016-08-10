package com.washingtin.jeenet.modules.gen.dao;

import com.washingtin.jeenet.common.persistence.CrudDao;
import com.washingtin.jeenet.common.persistence.annotation.MyBatisDao;
import com.washingtin.jeenet.modules.gen.entity.GenTableColumn;

/**
 * 描述：业务表字段DAO接口
 * @author jeenet
 */
@MyBatisDao
public interface GenTableColumnDao extends CrudDao<GenTableColumn> {
    public void deleteByGenTableId(String genTableId);
}
