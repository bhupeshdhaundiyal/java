package com.hdfc.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.Bo.AccountBO;


@Service
public class AccountService {
	@Autowired
	AccountBO accountBO;
	
	
	
public AccountBO getAccountBO() {
		return accountBO;
	}

	public void setAccountBO(AccountBO accountBO) {
		this.accountBO = accountBO;
	}

public void withDraw(){
	System.out.println("Service Called...");
	accountBO.checkAccount();
}
}