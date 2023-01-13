package com.bank.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.entity.Account;
import com.bank.entity.Client;


@Repository

public interface AccountRepository extends JpaRepository<Account,Integer>{
	
	Account findByAccountNumber(String accountNumber);
	
	List<Account> findByidClient (Client idClient);
	
	List<Account> findAllByidClient (Client idClient);

}
