package test2.backend.controller;

import test2.backend.model.Account;
import test2.backend.request.CreatNewAccount;
import test2.backend.service.AccountService;

import java.util.List;

public class AccountController {
    AccountService accountService = new AccountService();
    public List<Account> verifyAccount(String email, String password) {
        return accountService.verifyAccount(email, password);
    }

    public Account creatAccount(CreatNewAccount request) {
        return accountService.creatNewAccount(request);
    }

    public Account updatePass(String email, String password) {
        return accountService.updatePass(email, password);
    }

    public boolean checkEmailExist(String email) {
        return accountService.checkEmailExist(email);
    }

    public boolean checkEmailType(String email) {
        return accountService.checkEmailType(email);
    }

    public boolean checkPassType(String password) {
        return accountService.checkPassword(password);
    }

    public void updateUser(String email, String newUserName) {
        accountService.updateUser(email,newUserName);
    }

    public void updateEmail(String newEmail, String password) {
        accountService.updateEmail(newEmail,password);
    }
}
