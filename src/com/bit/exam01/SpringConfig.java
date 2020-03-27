package com.bit.exam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.bit.dao.GoodsDao;
import com.bit.dao.MemberDao;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfig {

	@Bean
	public ProfilingAdviceAspect advice() {
		return new ProfilingAdviceAspect();
	}
	
	@Bean 
	public MemberDao mDao() {
		return new MemberDao();
	}
	
	@Bean 
	public GoodsDao gDao() {
		return new GoodsDao();
	}
	
}







