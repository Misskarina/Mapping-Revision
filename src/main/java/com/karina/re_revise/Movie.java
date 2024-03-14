package com.karina.re_revise;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int mid;
	String moviename;
	String movietype;
	String releasedate;
	
	@JsonIgnore
	@OneToOne(cascade=CascadeType.ALL)
	Director Director;
	
	public Director getDirector() {
		return Director;
	}
	public void setDirector(Director director) {
		Director = director;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getMovietype() {
		return movietype;
	}
	public void setMovietype(String movietype) {
		this.movietype = movietype;
	}
	public String getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}
	
	
	

}
