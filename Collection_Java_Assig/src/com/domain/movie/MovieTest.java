package com.domain.movie;

import java.util.ArrayList;

import com.collection.movie.Movie_Details;
import com.collection.movie.Movie_DetailsList;

public class MovieTest {

	public static void main(String[] args) {
		ArrayList<Movie_Details> movies=new ArrayList<>();
		Movie_Details md1=new Movie_Details("SVSC", "Mahesh","Samantha","family");
		Movie_Details md2=new Movie_Details("Bunny", "AArjun","Usha","Action");
		Movie_Details md3=new Movie_Details("Geetha Govindham", "VDevarakonda","Rashmika","Love");
		Movie_Details md4=new Movie_Details("Nenu local", "Nani","Keerthi","Action");
		Movie_Details md5=new Movie_Details("Barath Ane Nenu", "Mahesh","Kiara","Political");
		Movie_DetailsList mm=new Movie_DetailsList();
		mm.add_movie(md1);
		mm.add_movie(md2);
		mm.add_movie(md3);
		mm.add_movie(md4);
		mm.add_movie(md5);
		
		System.out.println(mm.find_movie_By_Genre("family"));
	}

}
