package com.sda.bankingapp.load;

import com.sda.bankingapp.model.Account;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvFileLoader implements FileLoader {

    @Override
    public List<Account> loadDate() throws IOException {
        String stringPath = "D:\\SDA\\Scoala\\bankingapp\\src\\main\\resources\\accounts-db.txt";
        Path path = Paths.get(stringPath);
        List<String> accountLines = Files.readAllLines(path);

        // for each line add list;
        List<Account> accounts = new ArrayList<Account>();
        for (String accountLine : accountLines) {

            // split line by columns (comma separated);
            String[] accountInfo = accountLine.split(",");
            // capture values from string[]
            String owner = accountInfo[0];
            BigDecimal balance = new BigDecimal(accountInfo[1]);
        }
        return accounts;
    }
}
