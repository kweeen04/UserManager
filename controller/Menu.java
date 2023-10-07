package controller;

import model.Account;
import model.UserDatabase;
import view.View;

public class Menu {
    private UserDatabase model;
    private View view;

    public Menu(UserDatabase model, View view) {
        this.model = model;
        this.view = view;
    }
    
    public void run() {
        int choice;
        do {
            choice = view.getChoice();
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Exiting the program..");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }

    public void createAccount() {
        try {
            Account newAccount = view.getAccountInfo();
            model.addAccount(newAccount);
            System.out.println("Account created successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void login() {
        try {
            Account userAccount = view.getAccountInfo();
            Account foundAccount = model.find(userAccount);
            System.out.println("Login succesfull.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
