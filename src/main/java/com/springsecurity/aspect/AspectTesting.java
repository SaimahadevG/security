package com.springsecurity.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

//@Aspect
@Component
public class AspectTesting {
//	@Pointcut("execution(* com.springsecurity..*(..)) && !within(org.springframework.security.web.authentication..*)")
//	public void methodExec() {
//	}
//
//	
//
//	@Before("methodExec()")
//	public void executedMethod(JoinPoint joinpoint) {
//		System.out.println("method executed " + joinpoint.getSignature().getName());
//	}

}
