package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Album;
import com.revature.model.Tag;
import com.revature.repository.AlbumRepository;
import com.revature.repository.TagRepository;

@Service
public class TagService {
	private TagRepository tagRepo;
	
	public TagService() {
		
	}
	
	@Autowired
	public TagService(TagRepository repo) {
		this.tagRepo = repo;
	}
	public Tag getTagById(Integer id) {
		Tag t = tagRepo.findTagByTagId(id);
		return t;
	}
}
