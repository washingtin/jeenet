package com.washingtin.jeenet.modules.sys.service;

import com.washingtin.jeenet.common.service.CrudService;
import com.washingtin.jeenet.common.utils.CacheUtils;
import com.washingtin.jeenet.modules.sys.dao.DictDao;
import com.washingtin.jeenet.modules.sys.entity.Dict;
import com.washingtin.jeenet.modules.sys.utils.DictUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 描述：字典service
 * @author jeenet
 */
@Service
@Transactional(readOnly = true)
public class DictService extends CrudService<DictDao, Dict> {
    /**
     * 查询字段类型列表
     * @return
     */
    public List<String> findTypeList(){
        return dao.findTypeList(new Dict());
    }

    @Transactional(readOnly = false)
    public void save(Dict dict) {
        super.save(dict);
        CacheUtils.remove(DictUtils.CACHE_DICT_MAP);
    }

    @Transactional(readOnly = false)
    public void delete(Dict dict) {
        super.delete(dict);
        CacheUtils.remove(DictUtils.CACHE_DICT_MAP);
    }
}
