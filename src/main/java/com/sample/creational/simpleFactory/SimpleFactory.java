package com.sample.creational.simpleFactory;

import com.sample.creational.simpleFactory.services.Post;
import com.sample.creational.simpleFactory.util.PostFactory;

public class SimpleFactory {

	public static void main(String[] args) {
		Post post = PostFactory.createPost("news","Apocalypse Now");
		post.setTitle("My title");
		post.setContent("My Content");
		System.out.println(post.getInfo(post));
	}
}
