package com.karina.re_revise;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Director {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int Directorid;
	String Directorname;
	String Directoraddress;
	
	@OneToOne(cascade=CascadeType.ALL)
	Movie Movie;
	

	public int getDirectorid() {
		return Directorid;
	}

	public void setDirectorid(int directorid) {
		Directorid = directorid;
	}

	public String getDirectorname() {
		return Directorname;
	}

	public void setDirectorname(String directorname) {
		Directorname = directorname;
	}

	public String getDirectoraddress() {
		return Directoraddress;
	}

	public void setDirectoraddress(String directoraddress) {
		Directoraddress = directoraddress;
	}

	public Movie getMovie() {
		return Movie;
	}

	public void setMovie(Movie movie) {
		Movie = movie;
	}
	
	

}
