package net.daum.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example")
public class exampleController {
	@RequestMapping("/list")
	public void list(Model model) throws Exception {
		
	}
	
	@RequestMapping("/detail")
	public void detail(Model model) throws Exception {
		
	}
}
