package com.app.stamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.stamp.repository.ArtistRepository;

@Service
public class ArtistService {

	@Autowired
	ArtistRepository artistRepository;
	
	public void createArtist(ArtistCreationRequest) {
		
	}
	
}
