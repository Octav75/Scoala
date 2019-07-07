package com.sda.bankingapp.export;

import com.sda.bankingapp.model.Account;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public interface CustomFileWriter {
    String ACCOUNTS_DB = "D:\\SDA\\Scoala\\bankingapp\\src\\main\\resources\\accounts-db.txt";
    // transform calea intr-un obiect;
    Path path = Paths.get(ACCOUNTS_DB);
    void persist(Account account) throws IOException;



}
