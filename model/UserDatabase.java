package model;

import java.util.ArrayList;
import java.util.List;

public class UserDatabase {
    private List<Account> accounts;

    public UserDatabase() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account acc) throws Exception {
        if(acc.getUsername().length() < 5 || acc.getPassword().length() < 6) {
            throw new Exception("Invalid input. Username must be at least 5 characters, and password must be at least 6 characters.");
        }

        if (existUsername(acc.getUsername())) {
            throw new Exception("Username already exists. Please choose a different username.");
        }

        accounts.add(acc);
    }

    public Account find(Account acc) throws Exception {
        for (Account account : accounts) {
            if (account.getUsername().equals(acc.getUsername()) && account.getPassword().equals(acc.getPassword())) {
                return account;
            }
        }
        throw new Exception("Invalid username or password.");
    }

    public boolean existUsername(String username) {
        for (Account account : accounts) {
            if (account.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
