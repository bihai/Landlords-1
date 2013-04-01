package com.tiaobug.landlords;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tiaobug.landlords.domain.Card;
import com.tiaobug.landlords.domain.Poker;
import com.tiaobug.landlords.util.ComparatorCard;

public class Judgement {

	public static Map<String, Object> getPokers() {
		Map< String, Object>  pokersMap=new HashMap<String, Object>();
		List< Card> listAll=Poker.getOnePoker();
		List< Card> listA=listAll.subList(0, 17);
		List< Card> listB=listAll.subList(17, 34);
		List< Card> listC=listAll.subList(34, 51);
		List< Card> listFree=listAll.subList(51, 54);
		Collections.sort(listA, new ComparatorCard());
		pokersMap.put("listA", listA);
		Collections.sort(listB, new ComparatorCard());
		pokersMap.put("listB", listB);
		Collections.sort(listC, new ComparatorCard());
		pokersMap.put("listC", listC);
		pokersMap.put("listFree", listFree);
		return pokersMap;
	}
	
	
}
