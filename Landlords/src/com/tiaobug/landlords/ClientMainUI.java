package com.tiaobug.landlords;

import java.util.List;
import java.util.Map;

import com.tiaobug.landlords.domain.Card;

public class ClientMainUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// List< Card> list=(List<Card>)map.get("list");
		// for (int i = 0; i < list.size(); i++) {
		// System.out.println(list.get(i).toString() +"  ");;
		// }
		//

		Map<String, Object> map = Judgement.getPokers();

		List<Card> listA = (List<Card>) map.get("listA");
		for (int i = 0; i < listA.size(); i++) {
			System.out.print(listA.get(i).toString() + "  ");
			;
		}
		System.out.println();
		System.out.println();

		List<Card> listB = (List<Card>) map.get("listB");
		for (int i = 0; i < listB.size(); i++) {
			System.out.print(listB.get(i).toString() + "  ");
			;
		}
		System.out.println();
		System.out.println();

		List<Card> listC = (List<Card>) map.get("listC");
		for (int i = 0; i < listC.size(); i++) {
			System.out.print(listC.get(i).toString() + "  ");
			;
		}
		System.out.println();
		System.out.println();

		List<Card> listFree = (List<Card>) map.get("listFree");
		for (int i = 0; i < listFree.size(); i++) {
			System.out.print(listFree.get(i).toString() + "  ");
			;
		}
		System.out.println();
		System.out.println();

	}

}
