package com.wagnerandade.coollection.query.specification.custom;

import com.wagnerandade.coollection.query.criteria.Criteria;
import com.wagnerandade.coollection.query.specification.Specification;

public class AndSpecification<T> implements Specification<T> {

	@Override
	public boolean match(T item, Criteria<T> one, Criteria<T> other) {
		return one.match(item) && other.match(item);
	}

}