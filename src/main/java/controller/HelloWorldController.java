package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * SpringBoot 控制器，跟SpringMVC里面一样
 */
@Controller
public class HelloWorldController {

	@Value("${helloworld.msg}")
	private String msg;
	
	@RequestMapping("/hello")
	@ResponseBody
	public Map<String, Object> helloWorld() {
		Map<String, Object> map = new HashMap<>();
		map.put("msg", msg);
		return map;
	}
}
