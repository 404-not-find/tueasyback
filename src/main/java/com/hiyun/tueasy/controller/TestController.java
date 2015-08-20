package com.hiyun.tueasy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value="/test")
public class TestController {

	
	@RequestMapping(value="/ss")
	@ResponseBody
	public String homepage(HttpServletRequest request, HttpServletResponse response){
		return "1fffdddd";
	}
	
}
