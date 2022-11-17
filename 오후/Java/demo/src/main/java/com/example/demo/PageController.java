package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/")
	public String callIndxPage() {
		//return에 html파일 이름을 작성
		return "index";
	}
}
