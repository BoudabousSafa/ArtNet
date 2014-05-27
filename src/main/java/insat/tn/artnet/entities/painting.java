package insat.tn.artnet.entities;

import java.util.Date;
import java.util.List;

import javax.management.loading.PrivateClassLoader;

public class painting {
	
	private String title;
	private String artistname;
	private String category;
	private List<String> locations;
	private Date releaseDate;
	private String size;
	private int vote;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtistname() {
		return artistname;
	}
	public void setArtistname(String artistname) {
		this.artistname = artistname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<String> getLocations() {
		return locations;
	}
	public void setLocations(List<String> locations) {
		this.locations = locations;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getVote() {
		return vote;
	}
	public void setVote(int vote) {
		this.vote = vote;
	}
	
	
	
	

}
