package com.sda.bankingapp;

import com.sda.bankingapp.controller.MainController;
import com.sda.bankingapp.export.CustomFileWriter;
import com.sda.bankingapp.export.NioCustomFileWriter;
import com.sda.bankingapp.load.CsvFileLoader;
import com.sda.bankingapp.model.repository.AccountRepository;
import com.sda.bankingapp.ui.MenuBuilder;

import java.util.Scanner;

public class HomeBankApp {
    public static void main(String[] args) {
        // create app object;
        Scanner scanner = new Scanner(System.in);
        MenuBuilder menuBuilder = new MenuBuilder();
        CsvFileLoader csvFileLoader = new CsvFileLoader();

        CustomFileWriter customFileWriter = new NioCustomFileWriter();

        AccountRepository accountRepository = new AccountRepository(customFileWriter);
        MainController controller = new MainController(accountRepository);

        // run program;
        menuBuilder.displayMenu();

        // grab user input

        int option = scanner.nextInt();

    }
}
