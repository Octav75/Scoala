package com.sda.bankingapp.export;

import com.sda.bankingapp.model.Account;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class NioCustomFileWriter implements CustomFileWriter {
    @Override
    public void persist(Account account) throws IOException {
        // serialize object (transform to string);
        String accountString = account.getOwner() + "," + account.getBalance();
        // writ string to file (by appending, not replacing);
        Files.write (path, accountString.getBytes(), StandardOpenOption.APPEND);
    }
}
