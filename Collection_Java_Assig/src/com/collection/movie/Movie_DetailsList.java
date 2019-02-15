package com.collection.movie;

import java.util.ArrayList;
import java.util.Comparator;

public class Movie_DetailsList implements Comparable<Movie_Details>{
	Movie_Details m = new Movie_Details();
	ArrayList<Movie_Details> details;
	public Movie_DetailsList() {
		details = new ArrayList<>();
	}
	public void add_movie(Movie_Details md) {
		details.add(md);
	}
	public void remove_movie(Movie_Details md) {
		details.remove(md);
	}
	public void remove_AllMovie(Movie_Details md) {
		details.removeAll(details);
	}
	public void find_movie_By_movie_name(Movie_Details md) {
		int index = details.indexOf(m.getMovie_name());
	}
	public Movie_Details find_movie_By_Genre(String md) {
		Movie_Details m = null;
		for(Movie_Details m1:details){
			if(m1.getGenre().equals(md))
				m=m1;
		}
		return m;
	}
	@Override
	public int compareTo(Movie_Details arg0) {
		return this.m.getMovie_name().compareTo(arg0.getMovie_name());
	}
	
}
