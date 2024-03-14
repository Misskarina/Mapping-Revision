package com.karina.re_revise;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	@Autowired
	MovieRepository mrepo;
	@Autowired
	DirectorRepository drepo;
	
	@RequestMapping("/test")
	public String test()
	{
		return"the program is tested";
	}
	
	@RequestMapping("/save")
	public String save()
	{
		Movie m=new Movie();
		m.setMoviename("Kuch Kuch Hota Hai");
		m.setMovietype("Bollywood");
		m.setReleasedate("1998-10-16");
		
		Director d=new Director();
		d.setDirectorname("Karan Johar");
		d.setDirectoraddress("Mumbai");
		
		m.setDirector(d);
		d.setMovie(m);
	    mrepo.save(m);
	    
	    return"the data is saved";
		
	}
	
	@RequestMapping("/saveall")
	public String saveall()
	{
		Movie m1=new Movie();
		m1.setMoviename("Sholay");
		m1.setMovietype("Bollywood");
		m1.setReleasedate("1957");
		
		Director d1=new Director();
		d1.setDirectorname("Ramesh Sippy");
		d1.setDirectoraddress("Mumbai");
		
		m1.setDirector(d1);
		d1.setMovie(m1);
		mrepo.save(m1);
		
		Movie m2=new Movie();
		m2.setMoviename("Mother India");
		m2.setMovietype("Bollywood");
		m2.setReleasedate("1957");
		
		Director d2=new Director();
		d2.setDirectorname("Mohammad Khan");
		d2.setDirectoraddress("Gujrat");
		
		m2.setDirector(d2);
		d2.setMovie(m2);
		mrepo.save(m2);
		
		Movie m3=new Movie();
		m3.setMoviename("BaahuBali");
		m3.setMovietype("Tollywood");
		m3.setReleasedate("2015");
		
		Director d3=new Director();
		d3.setDirectorname("S S Rajamouli");
		d3.setDirectoraddress("Karnataka");
		
		m3.setDirector(d3);
		d3.setMovie(m3);
		mrepo.save(m3);
		
		List<Movie> list=Arrays.asList(m1,m2,m3);
		mrepo.saveAll(list);
		return "MULTIPLE DATA SAVED";
		
	}
	@RequestMapping("/findall")
	public List<Movie>  findall()
	{
		return mrepo.findAll();
	}

	
}
