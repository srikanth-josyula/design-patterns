package com.sample.creational.simpleFactory.services.impl;

import com.sample.creational.simpleFactory.services.Post;

/**
 * Represents a blog post.
 */

public class BlogPost extends Post {

	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String getInfo(Post p) {
		return "Title of the Post is "+p.getTitle()+ "\n content "+p.getContent()+"\n Welcome to BlogPost \n Author is "+author;
	}

}
