/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alcheminc;

import java.util.Scanner;

/**
 *
 * @author Aish
 */
public class EmployeeDetails {
    
    int option;
    Scanner scanner = new Scanner(System.in);    
    
    public void menu() {
        System.out.println("-----Menu-----");
        System.out.println("1. Enter Data");
        System.out.println("2. Update Data");
        System.out.println("3. Display Data");
        System.out.println("4. Exit");
        System.out.println("\n Choose Option: ");
        
        option = scanner.nextInt();
    }
    
    public static void main(String[] args) {
        EmployeeDetails displayMenu = new EmployeeDetails();
        
        displayMenu.menu();
      
    }
}
