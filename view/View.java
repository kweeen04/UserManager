package view;

import java.util.Scanner;

import model.Account;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public int getChoice() {
        System.out.println("====== USER MANAGEMENT SYSTEM ======");
        System.out.println("1. Create a new account");
        System.out.println("2. Login system");
        System.out.println("3. Exit");
        System.out.print("> Choose: ");
        return scanner.nextInt();
    }

    public Account getAccountInfo() {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        return new Account(username, password);
    }
}
