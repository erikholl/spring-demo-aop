package io.eho.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.eho.aopdemo.dao.AccountDAO;
import io.eho.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class); 
		
		// get the bean from spring container
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// get membership bean
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		// call the business method for accountDAO
		Account account = new Account();
		boolean vip = true;
		accountDAO.addAccount(account, vip);
		accountDAO.doWork();
		
		// call the business method for membershipDAO
		membershipDAO.addSilly();
		membershipDAO.goToSleep();
		
		// close the context
		context.close();

	}

}
