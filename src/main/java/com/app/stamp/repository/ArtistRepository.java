package com.app.stamp.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.stamp.entity.Artist;

public interface ArtistRepository extends JpaRepository<Artist, UUID>{

	
	
}
