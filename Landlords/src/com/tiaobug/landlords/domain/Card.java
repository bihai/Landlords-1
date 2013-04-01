package com.tiaobug.landlords.domain;

import com.tiaobug.landlords.statistics.CardNum;
import com.tiaobug.landlords.statistics.CardType;

public class Card {

	public Card(int id, int type, int number) {
		this.id = id;
		this.type = type;
		this.number = number;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int type;// 花色
	private int number;// 花点
	private int id;// 序号，从1 到 54，用于排序

	@Override
	public String toString() {
		if (this.type == CardType.REDJOKER) {
			return "大王";
		} else if (this.type == CardType.BLACKJOKER) {
			return "小王";
		} else if (this.number == CardNum.A) {
			return CardType.type(this.type) + " A";
		} else if (this.number == CardNum.J) {
			return CardType.type(this.type) + " J";
		} else if (this.number == CardNum.Q) {
			return CardType.type(this.type) + " Q";
		} else if (this.number == CardNum.K) {
			return CardType.type(this.type) + " K";
		}
		return CardType.type(this.type) + " "+this.number;
	}

}
