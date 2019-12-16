package com.sample.behavioral.iterator.aggregate.impl;

import com.sample.behavioral.iterator.Topic;
import com.sample.behavioral.iterator.aggregate.Collection;
import com.sample.behavioral.iterator.iterator.Iterator;
import com.sample.behavioral.iterator.iterator.impl.TopicIterator;

public class TopicCollection implements Collection<Topic>
{
    private Topic[] topics;
     
    public TopicCollection(Topic[] topics)
    {
        this.topics = topics;
    }
     
    public Iterator<Topic> iterator() {
        return new TopicIterator(topics);
    }
}