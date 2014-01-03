package net.daum.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/htdocs")
public class HtdocsController {
	
	@RequestMapping(value = "/**", method = RequestMethod.GET)
	public String htdocs(Model model,HttpServletRequest request) {
		String uri=request.getRequestURI();
		if(uri!=null) {
			uri=uri.replaceFirst("/app", "");
			model.addAttribute("filename",uri);
		}
		
		return "htdocs";
	}

}
