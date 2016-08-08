package com.washingtin.jeenet.common.supcan.freeform;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.washingtin.jeenet.common.supcan.common.Common;
import com.washingtin.jeenet.common.supcan.common.properties.Properties;

/**
 * 硕正FreeForm
 * @author jeenet
 */
@XStreamAlias("FreeForm")
public class FreeForm extends Common {

	public FreeForm() {
		super();
	}
	
	public FreeForm(Properties properties) {
		this();
		this.properties = properties;
	}
	
}
