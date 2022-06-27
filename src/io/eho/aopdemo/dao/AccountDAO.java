package io.eho.aopdemo.dao;

import org.springframework.stereotype.Component;

import io.eho.aopdemo.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account account, boolean vipFlag) {
		
		System.out.println(getClass() + ": Doing DB work: add account");
	}
	
	public boolean doWork() {
		
		System.out.println(getClass() + ": doing work");
		
		return true;
	}
	

}
