package test2.backend.repository;

import test2.backend.database.AccountDB;
import test2.backend.exception.NotFoundException;
import test2.backend.model.Account;
import test2.backend.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AccountReposity {

    public List<Account> findAll() {
        return AccountDB.accounts;
    }

    public void save(Account account) {
        AccountDB.accounts.add(account);
        FileUtils.setDataToFile("accounts.json",AccountDB.accounts);
    }

    public Account findByEmail(String email){
        List<Account> rs = new ArrayList<>();
        for(Account a: AccountDB.accounts){
            if (a.getEmail().equals(email)){
                return a;
            }
        }
        throw new NotFoundException("Chưa tồn tại tài khoản chứa email: " + email);
    }public Account findByPass(String password){
        List<Account> rs = new ArrayList<>();
        for(Account a: AccountDB.accounts){
            if (a.getPassword().equals(password)){
                return a;
            }
        }
        throw new NotFoundException("Xảy ra lỗi, hãy đăng nhập lại");
    }
    public Account updatePass(String email, String password) {
        Account account = findByEmail(email);
        account.setPassword(password);
        FileUtils.setDataToFile("accounts.json",AccountDB.accounts);
        return account;
    }

    public void updateUser(String email, String newUserName) {
        Account account = findByEmail(email);
        account.setUserName(newUserName);
        FileUtils.setDataToFile("accounts.json",AccountDB.accounts);
    }

    public void updateEmail(String newEmail, String password) {
        Account account = findByPass(password);
        account.setEmail(newEmail);
        FileUtils.setDataToFile("accounts.json",AccountDB.accounts);
    }
}
