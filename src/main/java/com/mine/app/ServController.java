package com.mine.app;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.mine.model.Job;
import com.mine.service.Stdservice;

@Controller
public class ServController {
	@Autowired
	private Stdservice service;
	
	@GetMapping({"/","home"})
	public String home() {
	
		return "home";
	}
	@GetMapping("addjob")
	public String addjob() {
	
		return "addjob";
	}
	@PostMapping("handleForm")
	public String handleform(@ModelAttribute Job job,Model model) {
		service.addjob(job);
		model.addAttribute("jobPost",job);
		return "success";
	}
	@GetMapping("viewalljobs")
	public String viewalljobs(Model model) {
	  List<Job> l= service.findAlljobs();
	  System.out.println(l);
	   model.addAttribute("jobPosts",l);
		return "viewalljobs";
	}

}
