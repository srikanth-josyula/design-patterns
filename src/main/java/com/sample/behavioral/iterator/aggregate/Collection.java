package com.sample.behavioral.iterator.aggregate;

import com.sample.behavioral.iterator.iterator.Iterator;

public interface Collection<E> {
	Iterator<E> iterator();
}