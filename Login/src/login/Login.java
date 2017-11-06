/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.Scanner;

/**
 *
 * @author Novanti Lumban Tobing 
 * Test Automation Script for Login
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = "novtobing@gmail.com";
        String password = "test123";
        System.out.printf("--Login--");
        System.out.println();
        System.out.printf("Email: ");
        String inputemail = input.next();
        if (!inputemail.equals(email)) {
            System.out.println("Email is wrong.");
        }

        System.out.printf("Password: ");
        String pass = input.next();
        if (!pass.equals(password)) {
            System.out.println("password is wrong.");
        }
    }

}
