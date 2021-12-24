package com.app.stamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.stamp.entity.Artist;
import com.app.stamp.service.ArtistService;

@RestController
@RequestMapping("/api/stamp/v1")
public class ArtistController {

	@Autowired
	ArtistService artistService;
	
	@PostMapping
	public ResponseEntity<Void> createArtist(@RequestBody Artist artist) {
		return ResponseEntity.ok();
	}
	
}
