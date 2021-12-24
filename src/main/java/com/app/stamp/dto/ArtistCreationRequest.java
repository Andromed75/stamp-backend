package com.app.stamp.dto;

import java.util.List;

import com.app.stamp.entity.Release;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtistCreationRequest {

	String name;
	
	List<Release> releases;
	
}
