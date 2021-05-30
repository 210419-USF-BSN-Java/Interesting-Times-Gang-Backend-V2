package com.revature.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.service.TagService;

@RestController
@RequestMapping(value="/tag")
public class TagController {
	private TagService tServ;
	
	public TagController(TagService serv) {
		this.tServ = serv;
	}
	
	// Post a new tag
	@PostMapping(value="/create")
	public Integer createTag() {
		// implement the creation of a tag here
		return null;
	}
}
