package com.bit.exam01;

import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilingAdvice {
	
	public Object pro(ProceedingJoinPoint joinPoint) {
		Object re = null;
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName+"시작");
		long start = System.currentTimeMillis();
		try {
			re = joinPoint.proceed();
		}catch (Throwable e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println(methodName+"종료");
		long finish = System.currentTimeMillis();
		System.out.println("걸린시간:"+ (finish-start));
		return re;
	}
}












