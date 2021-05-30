package com.revature.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Tag;

@Repository
@Transactional
public interface TagRepository {
	public Tag findTagByTagId(Integer id);
}
