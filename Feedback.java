package com.feedback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback", schema = "ecommerce")
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String userfeedback;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserfeedback() {
		return userfeedback;
	}
	public void setUserfeedback(String userfeedback) {
		this.userfeedback = userfeedback;
	}
	@Override
	public String toString() {
		return "Feedback [username= " + username + ", userfeedback=" + userfeedback + "]";
	}

}
