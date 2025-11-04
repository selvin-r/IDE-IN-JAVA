package Encapsulation;

import java.util.Scanner;

class UserLogin {
    private String username;
    private String password;


    public void setLogin(String u, String p) {
        if (p.length() >= 8) {
            username = u;
            password = p;
            System.out.println(" User login details saved successfully.");
        } else {
            System.out.println(" Password is too short. Must be at least 8 characters.");
        }
    }


    public boolean auth(String u, String p) {
        if (username == null || password == null) {
            return false;
        }
        return username.equals(u) && password.equals(p);
    }
}

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserLogin us = new UserLogin();

        System.out.print("Enter Username: ");
        String uname = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        us.setLogin(uname, pass);


        System.out.print("Re-enter Username: ");
        String u = sc.nextLine();
        System.out.print("Re-enter Password: ");
        String p = sc.nextLine();

        if (us.auth(u, p)) {
            System.out.println(" Login Successful!");
        } else {
            System.out.println(" Error Login Failed!");
        }


    }
}
