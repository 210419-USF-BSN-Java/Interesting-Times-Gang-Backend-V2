///*
package com.revature.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Album;
import com.revature.service.AlbumService;

@RestController
@RequestMapping(value="/album")
public class AlbumController {
	
private AlbumService albumServ;
	
	public AlbumController(AlbumService serv) {
		this.albumServ = serv;
	}
	@GetMapping(value="/")
	public ResponseEntity<Album> getAlbum(@RequestBody Integer id){
		// use albumServ to get the album and all of the urls
		// use those urls as a list, and loop through it calling the nasa api on each
			// In each loop create a new image object by combining the two data structures
		// send the combined structure to the front end
		return null;
	}
	

}
//*/