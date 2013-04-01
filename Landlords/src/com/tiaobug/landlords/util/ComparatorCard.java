package com.tiaobug.landlords.util;

import java.util.Comparator;

import com.tiaobug.landlords.domain.Card;

public class ComparatorCard implements Comparator<Card> {

	@Override
	public int compare(Card c0, Card c1) {
		if (c0.getId() < c1.getId()) {
			return -1;
		} else {
			return 1;
		}

	}
}