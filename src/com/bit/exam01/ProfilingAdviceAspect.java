package com.bit.exam01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
public class ProfilingAdviceAspect {
	
	@Pointcut("execution(public * com.bit.dao..*(..))")
	private void daoMethod(){}
	
	@Around("daoMethod()")
	public Object pro(ProceedingJoinPoint joinPoint) {
		Object re = null;
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName+"����");
		long start = System.currentTimeMillis();
		try {
			re = joinPoint.proceed();
		}catch (Throwable e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println(methodName+"����");
		long finish = System.currentTimeMillis();
		System.out.println("�ɸ��ð�:"+ (finish-start));
		return re;
	}
}












