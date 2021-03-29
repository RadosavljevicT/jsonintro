package movie;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

public class Movie {
	
	@SerializedName("id")
	private String imdbID;
	
	private String title;
	
	@SerializedName("year")
	private int releaseYear;
	
	
	private transient double rating;
	
	private String[] actors;
	
	public String getImdbID() {
		return imdbID;
	}
	
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getReleaseYear() {
		return releaseYear;
	}
	
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	public double getRating() {
		return rating;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}

	public String[] getActors() {
		return actors;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		return "Movie [imdbID=" + imdbID + ", title=" + title + ", releaseYear=" + releaseYear + ", rating=" + rating
				+ ", actors=" + Arrays.toString(actors) + "]";
	}


	

}
