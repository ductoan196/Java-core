package test2.backend.service;

import test2.backend.exception.EmailNotValid;
import test2.backend.model.Account;
import test2.backend.repository.AccountReposity;
import test2.backend.request.CreatNewAccount;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    AccountReposity accountReposity = new AccountReposity();
    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String PASSWORD_PATTERN =
            "^[_A-Za-z0-9-]{7,15}$";


    public List<Account> verifyAccount(String email, String password) {
        List<Account> rs = new ArrayList<>();
        List<Account> accounts = accountReposity.findAll();
        for (Account a : accounts) {
            if (a.getEmail().equals(email) && a.getPassword().equals(password)) {
                rs.add(a);
            }
        }
        return rs;
    }

    public Account creatNewAccount(CreatNewAccount request) {
        Account account = new Account();
        account.setUserName(request.getUsername());
        account.setEmail(request.getEmail());
        account.setPassword(request.getPassword());
        accountReposity.save(account);
        return account;
    }


    public Account updatePass(String email, String password) {
        return accountReposity.updatePass(email, password);
    }

    public boolean checkEmailExist(String email) {
        for (Account a : accountReposity.findAll()) {
            if (a.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkEmailType(String email) {
        if (email.matches(EMAIL_PATTERN)) {
            return true;
        }
        return false;
    }

    public boolean checkPassword(String password) {
        if(password.matches(PASSWORD_PATTERN)){
            return true;
        }
        return false;
    }

    public void updateUser(String email, String newUserName) {
        accountReposity.updateUser(email, newUserName);
    }

    public void updateEmail(String newEmail, String password) {
        accountReposity.updateEmail(newEmail, password);
    }
}
