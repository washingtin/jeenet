package com.washingtin.jeenet.modules.sys.dao;

import com.washingtin.jeenet.common.persistence.CrudDao;
import com.washingtin.jeenet.common.persistence.annotation.MyBatisDao;
import com.washingtin.jeenet.modules.sys.entity.Menu;

import java.util.List;

/**
 * 描述：菜单DAO接口
 * @author jeenet
 */
@MyBatisDao
public interface MenuDao extends CrudDao<Menu> {
    public List<Menu> findByParentIdsLike(Menu menu);

    public List<Menu> findByUserId(Menu menu);

    public int updateParentIds(Menu menu);

    public int updateSort(Menu menu);
}
