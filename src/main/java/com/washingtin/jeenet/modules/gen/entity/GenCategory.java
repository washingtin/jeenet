package com.washingtin.jeenet.modules.gen.entity;

import com.washingtin.jeenet.modules.sys.entity.Dict;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * 描述：生成方案Category
 * @author jeenet
 */
public class GenCategory extends Dict {

    private List<String> template;			// 主表模板
    private List<String> childTableTemplate;// 子表模板

    public static String CATEGORY_REF = "category-ref:";

    public GenCategory() {
        super();
    }

    @XmlElement(name = "template")
    public List<String> getTemplate() {
        return template;
    }

    public void setTemplate(List<String> template) {
        this.template = template;
    }

    @XmlElementWrapper(name = "childTable")
    @XmlElement(name = "template")
    public List<String> getChildTableTemplate() {
        return childTableTemplate;
    }

    public void setChildTableTemplate(List<String> childTableTemplate) {
        this.childTableTemplate = childTableTemplate;
    }
}
