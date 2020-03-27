package com.bit.exam01;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.dao.GoodsDao;
import com.bit.dao.MemberDao;

public class MainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context
		= new AnnotationConfigApplicationContext(SpringConfig.class);
		
		MemberDao mDao = (MemberDao)context.getBean("mDao");
		GoodsDao gDao = (GoodsDao)context.getBean("gDao");
		
		mDao.insertMember("유관순", 20);
		mDao.updateMember();
		ArrayList<String > memberList = mDao.listMember();
		for(String member: memberList) {
			System.out.println(member);
		}
		
		
		gDao.insertGoods("옥수수", 3000);
		ArrayList<String> goodsList =   gDao.list();
		for(String item  :goodsList) {
			System.out.println(item);
		}
	}	
}







