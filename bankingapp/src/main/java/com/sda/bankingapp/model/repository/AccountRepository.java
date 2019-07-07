package com.sda.bankingapp.model.repository;

import com.sda.bankingapp.export.CustomFileWriter;
import com.sda.bankingapp.export.NioCustomFileWriter;
import com.sda.bankingapp.model.Account;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountRepository {

    // use file writer to persit accounts;
    private NioCustomFileWriter fileWriter;

    // dependency injection;
    // external instantietion;
        public AccountRepository(CustomFileWriter fileWriter){
        this.fileWriter = new NioCustomFileWriter();
    }

    private static List<Account> accounts = new ArrayList<>();
    // list account este statica pentru a putea fi folosita in toata aplicatia si sa nu fie duplicat!!!

    // implement create account;
    public void createAccount (){
        // grab user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify the owner name: ");
        String owner = scanner.nextLine();

        System.out.println("Initial deposit: ");
        BigDecimal balance = scanner.nextBigDecimal();


        // TODO: save to file;
        try {
            Account account = new Account(owner, balance);
            accounts.add(account);

            fileWriter.persist(account);
            System.out.println("error: to persist account");
        } catch (IOException e) {
            System.out.println("info: account created " + account);
        }

    }
}
