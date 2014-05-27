package tn.insat.artnet.entities;

import java.util.Date;
import java.util.UUID;

public class Comment {
	private UUID idComment;
	private String artwork ;
	private String body;
	private String user;
	private Date date;
	public UUID getIdComment() {
		return idComment;
	}
	public void setIdComment(UUID idComment) {
		this.idComment = idComment;
	}
	public String getArtwork() {
		return artwork;
	}
	public void setArtwork(String artwork) {
		this.artwork = artwork;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

}
