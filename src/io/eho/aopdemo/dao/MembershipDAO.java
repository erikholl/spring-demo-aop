package io.eho.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public boolean addSilly() {
		
		System.out.println(getClass() + ": Doing stuff: adding a membership account");
		
		return true;
		
	}
}
