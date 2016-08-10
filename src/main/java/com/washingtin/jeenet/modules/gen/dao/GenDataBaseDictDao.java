package com.washingtin.jeenet.modules.gen.dao;

import com.washingtin.jeenet.common.persistence.CrudDao;
import com.washingtin.jeenet.common.persistence.annotation.MyBatisDao;
import com.washingtin.jeenet.modules.gen.entity.GenTable;
import com.washingtin.jeenet.modules.gen.entity.GenTableColumn;

import java.util.List;

/**
 * 描述：业务表字段DAO接口
 * @author jeenet
 */
@MyBatisDao
public interface GenDataBaseDictDao extends CrudDao<GenTableColumn> {
    /**
     * 查询表列表
     * @param genTable
     * @return
     */
    List<GenTable> findTableList(GenTable genTable);

    /**
     * 获取数据表字段
     * @param genTable
     * @return
     */
    List<GenTableColumn> findTableColumnList(GenTable genTable);

    /**
     * 获取数据表主键
     * @param genTable
     * @return
     */
    List<String> findTablePK(GenTable genTable);
}
