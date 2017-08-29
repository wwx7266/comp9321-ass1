package com.mkyong;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	// inject via application.properties
//	@Value("${welcome.message:test}")
	private String message = "WTF";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
	
	@RequestMapping("/search")
	public String search(Map<String, Object> model) {
		model.put("message", this.message);
		return "search";
	}
	
	@RequestMapping("/result")
	public String result(Map<String, Object> model, SearchParam param) {
		model.put("message", this.message);
		System.out.println(param.toString());
		model.put("par",param);
		return "result";
	}
	
	@RequestMapping("/about")
	public String about(Map<String, Object> model) {
		model.put("message", this.message);
		return "about";
	}

}