/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.util.Scanner;

/**
 *
 * @author Novanti Lumban Tobing 
 * Test Automation Script for Search
 */
public class Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Search:");
        System.out.println();
        String inputan = input.next();
        if (inputan.equals("dress")) {
            System.out.println("Casual Dress");
            System.out.println("Evening Dress");
            System.out.println("Summer Dress");
        }
        else if(inputan.equals("tops"))
        {
            System.out.println("T-shirt");
            System.out.println("Blouse");
        }
        else
        {
            System.out.println("There is no product");
        }
    }
    
}
