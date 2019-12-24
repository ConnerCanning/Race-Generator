package com.racegenweb.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.racegenweb.model.Race;

@Controller
public class HomeController {
	
	
	@RequestMapping("/generate")
	public File home() {
		return new File("testfiles/one_lap_ten_racers.rce");
	}

}
