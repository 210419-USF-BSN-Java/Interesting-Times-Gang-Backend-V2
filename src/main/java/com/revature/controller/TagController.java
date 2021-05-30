package com.revature.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.revature.model.Album;
import com.revature.model.Image;
import com.revature.service.TagService;

@Controller
@RequestMapping(value="/tag")
public class TagController {
	private TagService tagServ;
	
	public TagController(TagService serv) {
		this.tagServ = serv;
	}
	@GetMapping(value="/")
	public ResponseEntity<Image> getAlbumsByUserId(@RequestBody Integer id){
		//1 get the tag from the params
		
		//2 pull all dates related to that id from the database
		
		//3 use the dates to query the API and get the image JSON
		
		//4 send the images to the front end

		return null;
	}
}
