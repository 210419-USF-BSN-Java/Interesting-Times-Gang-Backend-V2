///*
package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Album;
import com.revature.model.Image;

@Repository
@Transactional
public interface AlbumRepository extends JpaRepository<Album, Long>{
	Album findAlbumById(Integer id);
}
//*/