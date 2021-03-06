package com.washingtin.jeenet.modules.gen.service;

import com.washingtin.jeenet.common.persistence.Page;
import com.washingtin.jeenet.common.service.BaseService;
import com.washingtin.jeenet.common.utils.StringUtils;
import com.washingtin.jeenet.modules.gen.dao.GenTemplateDao;
import com.washingtin.jeenet.modules.gen.entity.GenTemplate;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 描述：代码模板Service
 * @author jeenet
 */
@Service
@Transactional(readOnly = true)
public class GenTemplateService extends BaseService {
    @Autowired
    private GenTemplateDao genTemplateDao;

    public GenTemplate get(String id) {
        return genTemplateDao.get(id);
    }

    public Page<GenTemplate> find(Page<GenTemplate> page, GenTemplate genTemplate) {
        genTemplate.setPage(page);
        page.setList(genTemplateDao.findList(genTemplate));
        return page;
    }

    @Transactional(readOnly = false)
    public void save(GenTemplate genTemplate) {
        if (genTemplate.getContent()!=null){
            genTemplate.setContent(StringEscapeUtils.unescapeHtml4(genTemplate.getContent()));
        }
        if (StringUtils.isBlank(genTemplate.getId())){
            genTemplate.preInsert();
            genTemplateDao.insert(genTemplate);
        }else{
            genTemplate.preUpdate();
            genTemplateDao.update(genTemplate);
        }
    }

    @Transactional(readOnly = false)
    public void delete(GenTemplate genTemplate) {
        genTemplateDao.delete(genTemplate);
    }

}
