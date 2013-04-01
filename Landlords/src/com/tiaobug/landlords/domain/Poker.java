package com.tiaobug.landlords.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.tiaobug.landlords.statistics.CardType;

public class Poker {
	
	public static List<Card> getOnePoker() {
		List< Card> list=new ArrayList<Card>();
		Card card;
		// new Card的第一个参数要照顾到排序的从左到右的大小
		Card redJoker=new Card(1, CardType.REDJOKER, 0);
		Card blackJoker=new Card(2, CardType.BLACKJOKER, 0);
		list.add(blackJoker);
		list.add(redJoker);
		
		//处理A和2
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 4; j++) {
				card=new Card((i-1)*4+2+j, j, 3-i);
				list.add(card);
			}
		}
		//处理  3-K
		for (int i = 3; i <= 13; i++) {
			for (int j = 1; j <= 4; j++) {
				card=new Card((i-1)*4+2+j, j, 16-i);
				list.add(card);
			}
		}
		
		//洗牌
		Random random=new Random();
		List< Card> list2=new ArrayList<Card>();
		for (int i= 54; i >=1; i--) {
			int index=random.nextInt(i);
			list2.add(list.get(index));
			list.remove(index);
		}
		return list2; 
	}

}
