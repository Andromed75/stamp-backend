package com.app.stamp.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Release {

	@Id
	UUID id;
	
	@OneToMany(targetEntity = Artist.class, cascade = CascadeType.ALL)
	@JoinColumn
	List<Artist> artists;
	
	@Column(length = 50)
	String date;
	
	@Column(length = 2000)
	String image;
	
	@OneToMany(targetEntity = Title.class, cascade = CascadeType.ALL)
	List<Title> titles;
	
	
}
