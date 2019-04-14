package com.hdfc.Bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hdfc.Dao.AccountDAO;


@Component
public class AccountBO {
	@Autowired
	AccountDAO accountDAO;
	
	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	public void checkAccount(){
		System.out.println("Business Object call");
		accountDAO.checkAccountFromDB();
	}
}
