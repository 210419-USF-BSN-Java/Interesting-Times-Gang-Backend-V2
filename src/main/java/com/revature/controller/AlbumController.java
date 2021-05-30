///*
package com.revature.controller;

import java.util.List;

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
	public ResponseEntity<Album> getAlbumsByUserId(@RequestBody Integer id){

		//1 Use the userId to get all of the Albums with that id
		List<Album> i = albumServ.getAlbumsById(id);

		//2 Use the ids in the above list to return all image dates using the AlbumJunction table

		//3 Use those dates to retrieve all of the JSON image objects from the API

		//4 Use some form of nested loop to append images to the appropriate FrontAlbum

		//5 Convert that FrontAlbum into a JSON and send it to the front

		return null;
	}
}
//*/