/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.washingtin.jeenet.common.supcan.annotation.common.properties;

import java.lang.annotation.*;

/**
 * 硕正Background注解
 * @author jeenet
 */
@Target({ ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface SupBackground {
	
	/**
	 * 背景颜色
	 * @return
	 */
	String bgColor() default "";

}
