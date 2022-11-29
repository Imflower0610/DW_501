package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/")
	public String callIndxPage() {
		//return에 html파일 이름을 작성
		return "index";
		
	}
	//사용자가 home주소 입력시 home이름을 가진 html을 return
	@GetMapping("/home")
	   public String callHomePage(HttpServletRequest request) {
		
		String ip = request.getRemoteAddr();
		   System.out.println("요청받은 IP : " + ip);
		   
	      return "home";
	   }
	@GetMapping("/movie")
	   public String callMoviepage() {
	      return "movie";
	   }
	@GetMapping("/login")
	public String callLoginPage() {
		return "login";
	}
	@GetMapping("/login2")
	public String callLoginPage2() {
		return "login2";
	}
	@GetMapping("/emp")
	public String callemppage() {
		return "emp";
	}
	@GetMapping("/dept")
	public String calldeptpage() {
		return "dept";
	}
}
