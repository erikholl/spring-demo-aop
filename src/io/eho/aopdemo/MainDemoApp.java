package io.eho.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.eho.aopdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class); 
		
		// get the bean from spring container
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// call the business method
		accountDAO.addAccount();
		
		// do it again
		System.out.println("\nlet's call it again!\n");
		
		// call business method again
		accountDAO.addAccount();
		
		// close the context
		context.close();

	}

}
