package com.sda.bankingapp.load;

import com.sda.bankingapp.model.Account;

import java.io.IOException;
import java.util.List;

public interface FileLoader {

    public List<Account> loadDate() throws IOException;
}
