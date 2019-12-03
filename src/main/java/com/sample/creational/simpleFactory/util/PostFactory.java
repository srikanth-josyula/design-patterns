package com.sample.creational.simpleFactory.util;

import com.sample.creational.simpleFactory.services.Post;
import com.sample.creational.simpleFactory.services.impl.BlogPost;
import com.sample.creational.simpleFactory.services.impl.NewsPost;

/**
 * This class acts as a simple factory for creation of different posts on web
 * site.
 *
 */
public class PostFactory {

	public static Post createPost(String type, String data) {
		if (type.equalsIgnoreCase("blog")) {
			BlogPost bp = new BlogPost();
			bp.setAuthor(data);
			return bp;
		} else if (type.equalsIgnoreCase("news")) {
			NewsPost np = new NewsPost();
			np.setHeadline(data);
			return np;
		} else {
			throw new IllegalArgumentException("Post type is unknown");
		}
	}
}
