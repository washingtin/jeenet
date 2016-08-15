package com.washingtin.jeenet.modules.sys.dao;

import com.washingtin.jeenet.common.persistence.CrudDao;
import com.washingtin.jeenet.common.persistence.annotation.MyBatisDao;
import com.washingtin.jeenet.modules.sys.entity.Dict;

import java.util.List;

/**
 * 描述：字典DAO接口
 * @author jeenet
 */
@MyBatisDao
public interface DictDao extends CrudDao<Dict>{
    public List<String> findTypeList(Dict dict);
}
