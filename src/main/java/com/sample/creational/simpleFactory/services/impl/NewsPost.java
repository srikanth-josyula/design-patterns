package com.sample.creational.simpleFactory.services.impl;

import com.sample.creational.simpleFactory.services.Post;

/**
 * Represents a news post.
 *
 */
public class NewsPost extends Post{

	private String headline;

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	@Override
	public String getInfo(Post p) {
		return "Title of the Post is "+p.getTitle()+ "\n content "+p.getContent()+"\n Welcome to NewsPost \n Headline is "+headline;
	}
	
}
