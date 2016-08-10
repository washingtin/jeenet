package com.washingtin.jeenet.modules.sys.service;

import com.washingtin.jeenet.common.service.TreeService;
import com.washingtin.jeenet.modules.sys.dao.AreaDao;
import com.washingtin.jeenet.modules.sys.entity.Area;
import com.washingtin.jeenet.modules.sys.utils.UserUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 描述：区域Service
 * @author jeenet
 */
@Service
@Transactional(readOnly = true)
public class AreaService extends TreeService<AreaDao, Area> {
    public List<Area> findAll(){
        return UserUtils.getAreaList();
    }

    @Transactional(readOnly = false)
    public void save(Area area) {
        super.save(area);
        UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
    }

    @Transactional(readOnly = false)
    public void delete(Area area) {
        super.delete(area);
        UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
    }
}
