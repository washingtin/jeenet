package com.washingtin.jeenet.test.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.washingtin.jeenet.common.config.Global;
import com.washingtin.jeenet.common.persistence.Page;
import com.washingtin.jeenet.common.utils.StringUtils;
import com.washingtin.jeenet.common.web.BaseController;
import com.washingtin.jeenet.test.entity.TestData;
import com.washingtin.jeenet.test.service.TestDataService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * 单表生成Controller
 * @author jeenet
 */
@Controller
@RequestMapping(value = "${adminPath}/test/testData")
public class TestDataController extends BaseController {

	@Autowired
	private TestDataService testDataService;
	
	@ModelAttribute
	public TestData get(@RequestParam(required=false) String id) {
		TestData entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = testDataService.get(id);
		}
		if (entity == null){
			entity = new TestData();
		}
		return entity;
	}
	
	@RequiresPermissions("test:testData:view")
	@RequestMapping(value = {"list", ""})
	public String list(TestData testData, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<TestData> page = testDataService.findPage(new Page<TestData>(request, response), testData);
		model.addAttribute("page", page);
		return "jeesite/test/testDataList";
	}

	@RequiresPermissions("test:testData:view")
	@RequestMapping(value = "form")
	public String form(TestData testData, Model model) {
		model.addAttribute("testData", testData);
		return "jeesite/test/testDataForm";
	}

	@RequiresPermissions("test:testData:edit")
	@RequestMapping(value = "save")
	public String save(TestData testData, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, testData)){
			return form(testData, model);
		}
		testDataService.save(testData);
		addMessage(redirectAttributes, "保存单表成功");
		return "redirect:"+Global.getAdminPath()+"/test/testData/?repage";
	}
	
	@RequiresPermissions("test:testData:edit")
	@RequestMapping(value = "delete")
	public String delete(TestData testData, RedirectAttributes redirectAttributes) {
		testDataService.delete(testData);
		addMessage(redirectAttributes, "删除单表成功");
		return "redirect:"+ Global.getAdminPath()+"/test/testData/?repage";
	}

}