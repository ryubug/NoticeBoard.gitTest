package com.test.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class NewBoard {

	
	@RequestMapping("/home")
	public String getHome() {
		return "/testBoard/Newboard";
	}
}