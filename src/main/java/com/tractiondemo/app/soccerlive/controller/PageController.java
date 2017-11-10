package com.tractiondemo.app.soccerlive.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tractiondemo.app.soccerlive.application.Application;

@Controller
public class PageController {
	
	@Autowired
	private Application application;

	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public ModelAndView showTeams(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject(application.getLeagueTable());
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping(value = {"/team"}, method = RequestMethod.GET)
	public ModelAndView showTeam(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("team", application.getTeam(1));
		map.put("fixtures", application.getFixtures(1));
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addAllObjects(map);
		modelAndView.setViewName("team");
		return modelAndView;
	}


	
}
