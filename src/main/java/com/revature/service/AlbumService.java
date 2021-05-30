///*
package com.revature.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Album;
import com.revature.repository.AlbumRepository;

@Service
public class AlbumService {
	private AlbumRepository albumRepo;

	public AlbumService() {
		
	}
	
	@Autowired
	public AlbumService(AlbumRepository repo) {
		this.albumRepo = repo;
	}
	public Album getAlbumById(Integer id) {
		Album a = albumRepo.findAlbumById(id);
		return a;
	}
}
//*/