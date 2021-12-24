package com.app.stamp.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Title {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	UUID id;
	
	@OneToOne(targetEntity = Artist.class)
	Artist artist;
	
	@Column(length = 50)
	String remixer;
	
	@Column(length = 50)
	String scid;
	
	@Column(length = 100)
	String scurl;
	
	@Column(length = 100)
	String title;
	
}
