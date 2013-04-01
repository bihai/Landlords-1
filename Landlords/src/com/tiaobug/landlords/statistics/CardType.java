package com.tiaobug.landlords.statistics;

public class CardType {

	public static final int HEART = 1;
	public static final int  DIAMOND= 2;
	public static final int SPADE = 3;
	public static final int CLUB = 4;
	public static final int REDJOKER = 5;
	public static final int BLACKJOKER = 6;
	
	
	public static String  type(int i) {
		switch (i) {
		case 1:return "红心";
		case 2:return "方块";	
		case 3:return "黑桃";	
		case 4:return "梅花";	
		default: return "";
		}
	}
}
