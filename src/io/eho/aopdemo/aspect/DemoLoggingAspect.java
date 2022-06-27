package io.eho.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {
	
	// this is where we add all related advises for logging
	// start with @Before advice
	
	@Before("execution(* io.eho.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=====>>> Executing @Before advice on method");
	}

}
