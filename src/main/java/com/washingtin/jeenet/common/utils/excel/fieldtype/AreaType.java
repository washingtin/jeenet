package com.washingtin.jeenet.common.utils.excel.fieldtype;

import com.washingtin.jeenet.common.utils.StringUtils;
import com.washingtin.jeenet.modules.sys.entity.Area;

/**
 * 字段类型转换
 * @author jeenet
 */
public class AreaType {

	/**
	 * 获取对象值（导入）
	 */
	public static Object getValue(String val) {
		for (Area e : UserUtils.getAreaList()){
			if (StringUtils.trimToEmpty(val).equals(e.getName())){
				return e;
			}
		}
		return null;
	}

	/**
	 * 获取对象值（导出）
	 */
	public static String setValue(Object val) {
		if (val != null && ((Area)val).getName() != null){
			return ((Area)val).getName();
		}
		return "";
	}
}
