/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testscript;

import java.util.Scanner;

/**
 *
 * @author Novanti Lumban Tobing Test Automation Script for Registration
 */
public class Testscript {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("--Registration--");
        System.out.println();
        System.out.printf("Email: ");
        String email = input.next();
        String email_pattern
                = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if (!email.matches(email_pattern)) {
            System.out.println("Please, enter the correct email : ");
        }
        System.out.printf("First name: ");
        String firstname = input.next();
        int length = 0, length2 = 0, i = 0;
        char c;
        length = firstname.length();
        for (i = 0; i < length; i++) //Check for `Firstname`
        {
            c = firstname.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) && c != ' ') {
                System.out.println("firstname couldnot be character.");
            }
        }
        System.out.printf("Last Name: ");
        String lastname = input.next();
        length2 = lastname.length();
        for (i = 0; i < length2; i++) //Check for `Lastname`
        {
            c = lastname.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) && c != ' ') {
                System.out.println("lastname couldnot be character.");
            }
        }
        System.out.printf("Password: ");
        String pass = input.next();
        int lengthpass = pass.length();
        if (lengthpass < 5) {
            System.out.println("Too short password, password must be 5 characters or more");
        }

        System.out.printf("Address: ");
        String address = input.next();

        if ("".equals(lastname)) {
            System.out.println("address is required.");
        }

        System.out.println("Zip/Postal Code:");
        String zip = input.next();
        String regexStrzip = "^[0-9]{6}$";
        if (!zip.matches(regexStrzip)) {
            System.out.println("Please, enter the correct zip : ");
        }

        System.out.println("Mobile Phone:");
        String mp = input.next();
        String regexStr = "^[0-9]*$";
        if (!mp.matches(regexStr)) {
            System.out.println("Please,enter the correct mobile phone : ");
        }

    }
}
