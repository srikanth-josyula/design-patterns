package com.sample.behavioral.iterator.iterator.impl;

import com.sample.behavioral.iterator.Topic;
import com.sample.behavioral.iterator.iterator.Iterator;

public class TopicIterator implements Iterator<Topic> {

	private Topic[] topics;
	private int position;

	public TopicIterator(Topic[] topics) {
		this.topics = topics;
		position = 0;
	}

	public void reset() {
		position = 0;
	}

	public Topic next() {
		return topics[position++];
	}

	public Topic currentItem() {
		return topics[position];
	}

	public boolean hasNext() {
		if (position >= topics.length)
			return false;
		return true;
	}
}