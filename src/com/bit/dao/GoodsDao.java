package com.bit.dao;

import java.util.ArrayList;

public class GoodsDao {
	public int insertGoods(String item, int price) {
		System.out.println("��ǰ�� ����Ͽ����ϴ�.");
		return 1;
	}
	
	public ArrayList<String> list(){
		ArrayList<String > list = new ArrayList<String>();
		list.add("���");
		list.add("����");
		list.add("������");
		//System.out.println( list.get(100)  );
		return list;
	}
}
