package com.sda.bankingapp.controller;

import com.sda.bankingapp.model.repository.AccountRepository;

public class MainController {

    private AccountRepository accountRepository;

    public MainController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // gestioneaza ce se introduce de la tastatura;
    // get input from user and delegate to a method;
    public void dispatch(int option){
        // tasta 1 => create account;
        // 2 => find all accounts;
        while(option != 0){
            switch (option){
                case 1:
                    // create Account();
            }
        }
    }
}
