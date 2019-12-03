package com.sample.creational.simpleFactory.services;

/**
 * Abstract post class. Represents a generic post on a web site.
 */
public abstract class Post {

	private String title;
	private String content;

	public abstract String getInfo(Post p);

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
