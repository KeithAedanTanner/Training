package com.springdata.day14.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "talks")
public class Talk {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;

	String name;
	String speaker;
	String venue;
	String duration;

	// Constructors
	public Talk() {
		this.id = 0;
	}

	public Talk(String name, String speaker, String venue, String duration) {
		super();
		this.name = name;
		this.speaker = speaker;
		this.venue = venue;
		this.duration = duration;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSpeaker() {
		return speaker;
	}

	public String getVenue() {
		return venue;
	}

	public String getDuration() {
		return duration;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Talk [id=" + id + ", name=" + name + ", speaker=" + speaker + ", venue=" + venue + ", duration="
				+ duration + "]";
	}
}