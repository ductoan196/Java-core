package test2.backend.database;

import test2.backend.model.Account;
import test2.backend.utils.FileUtils;

import java.util.List;

public class AccountDB {
    public static List<Account> accounts = FileUtils.getDataFromFile("accounts.json");
}
