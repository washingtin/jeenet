package com.washingtin.jeenet.modules.sys.service;

import com.washingtin.jeenet.common.service.TreeService;
import com.washingtin.jeenet.modules.sys.dao.OfficeDao;
import com.washingtin.jeenet.modules.sys.entity.Office;
import com.washingtin.jeenet.modules.sys.utils.UserUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：机构Service
 * @author jeenet
 */
@Service
@Transactional(readOnly = true)
public class OfficeService extends TreeService<OfficeDao, Office> {
    public List<Office> findAll(){
        return UserUtils.getOfficeList();
    }

    public List<Office> findList(Boolean isAll){
        if (isAll != null && isAll){
            return UserUtils.getOfficeAllList();
        }else{
            return UserUtils.getOfficeList();
        }
    }

    @Transactional(readOnly = true)
    public List<Office> findList(Office office){
        if(office != null){
            office.setParentIds(office.getParentIds()+"%");
            return dao.findByParentIdsLike(office);
        }
        return  new ArrayList<Office>();
    }

    @Transactional(readOnly = false)
    public void save(Office office) {
        super.save(office);
        UserUtils.removeCache(UserUtils.CACHE_OFFICE_LIST);
    }

    @Transactional(readOnly = false)
    public void delete(Office office) {
        super.delete(office);
        UserUtils.removeCache(UserUtils.CACHE_OFFICE_LIST);
    }
}
