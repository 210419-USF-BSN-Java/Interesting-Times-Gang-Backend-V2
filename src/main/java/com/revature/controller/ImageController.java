///*
package com.revature.controller;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.model.Image;
import com.revature.service.ImageService;

@RestController
@RequestMapping(value="/image")
public class ImageController {
	
	private ImageService imageServ;
	
	public ImageController(ImageService serv) {
		this.imageServ = serv;
	}
	
	
	@GetMapping(value="/")
	public ResponseEntity<Image[]> getApod(){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	    Date date = new Date();
	    String dateString = (formatter.format(date));
		
		
		//String apiCall = "https://api.nasa.gov/planetary/apod?api_key=OrYgMm5s6rF8nMLv95C5bbqgl440knaSZRijQzn5&start_date=2021-05-30&end_date=2021-05-30";
	    //String apiCall = "https://api.nasa.gov/planetary/apod?api_key=OrYgMm5s6rF8nMLv95C5bbqgl440knaSZRijQzn5&start_date=dateString&end_date=dateString";
		String apiCall = "https://api.nasa.gov/planetary/apod?"
		+ "api_key=OrYgMm5s6rF8nMLv95C5bbqgl440knaSZRijQzn5"
		+ "&start_date=" 
		+ dateString
		+ "&end_date="
		+ dateString;
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Image[]> response = rt.getForEntity(apiCall, Image[].class);
		Image[] images = response.getBody();
		
		// Then make a query to the database depending on what you are looking for
		// Get all images from the album that matche the date

		return new ResponseEntity<Image[]>(images, HttpStatus.OK);
	}
	
	@GetMapping(value="/getByDay")
	public ResponseEntity<Image[]> getByDay(@RequestBody String date){
		String dateString = date;
		
		String apiCall = "https://api.nasa.gov/planetary/apod?"
		+ "api_key=OrYgMm5s6rF8nMLv95C5bbqgl440knaSZRijQzn5"
		+ "&start_date=" 
		+ dateString
		+ "&end_date="
		+ dateString;
		
		RestTemplate rt = new RestTemplate();	
		
		// Turns JSON into Java Model
		ResponseEntity<Image[]> response = rt.getForEntity(apiCall, Image[].class);
		Image[] images = response.getBody();

		// Turns the Java into JSON
		return new ResponseEntity<Image[]>(images, HttpStatus.OK);
	}
}
//*/
