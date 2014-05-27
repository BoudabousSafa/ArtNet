package insat.tn.artnet.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

public class User {
	
	private String username;
	private String country;
	private Set<String> emails;
	private String firstname;
	private String lastname;
	private String password;
	private Date subscriptionDate;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Set<String> getEmails() {
		return emails;
	}
	public void setEmails(Set<String> emails) {
		this.emails = emails;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getSubscriptionDate() {
		return subscriptionDate;
	}
	public void setSubscriptionDate(Date subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}
	
	
	
	

}
