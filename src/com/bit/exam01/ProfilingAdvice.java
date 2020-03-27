package com.bit.exam01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilingAdvice {
	/*
	public void afterThrowing(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "�� ������������ �����Ͽ����ϴ�.");
	}
	*/
	public void afterThrowing(JoinPoint joinPoint, Throwable ex) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "�� ������������ �����Ͽ����ϴ�.");
		System.out.println("������ ���� ���ܰ� �߻��Ͽ����ϴ�.");
		System.out.println(ex.getMessage());
		System.out.println("===================================");
	}
	
	public void afterReturning(JoinPoint joinPoint, Object ret) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "�� ����Ϸ� �� �Դϴ�.");
		System.out.println("��ȯ���� ������ �����ϴ�.");
		System.out.println(ret);
		System.out.println("==================================");
	}
	
	/*
	public void afterReturning(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "�� ����Ϸ� �� �Դϴ�.");
	}*/
	
	
	public void after(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "�� �Ϸ� �� �Դϴ�.");
	}
	
	
	
	/*
	public void before() {
		System.out.println("Ÿ���� �Ǵ� �޼ҵ� �����ϱ� ���Դϴ�.");
	}
	*/
	public void before(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toLongString();
		System.out.println(methodName+ " �����ϱ� ���Դϴ�.");
	}
	
	
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












