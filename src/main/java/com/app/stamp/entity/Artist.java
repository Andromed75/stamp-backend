package com.app.stamp.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Artist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	UUID id;
	
	@Column(length = 50)
	String name;
	
	List<Release> releases;
	
}
