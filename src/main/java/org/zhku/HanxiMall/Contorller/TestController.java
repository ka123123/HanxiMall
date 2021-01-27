package org.zhku.HanxiMall.Contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@title  TestController
 *@description:测试
 *@author:dzx 
 *@date 2020年7月31日下午8:29:48
 */
@RequestMapping("test")
@RestController
public class TestController {
	/**
	 * 
	* @Title: hello
	* @Description:测试
	* @author:dzx
	* @date 2020年7月31日 下午8:34:32
	* @return String
	* @version
	 */
	@RequestMapping("hello")
	public String hello() {
		
		return "hello dzx";
		
	}
}
