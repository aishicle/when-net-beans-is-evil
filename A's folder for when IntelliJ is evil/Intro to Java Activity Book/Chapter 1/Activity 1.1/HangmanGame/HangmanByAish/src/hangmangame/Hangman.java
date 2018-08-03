/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmangame;

import java.util.Scanner;

/* @author Aish */
public class Hangman {
    
    public void showMenu () {
        int options;
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO HANGMAN\n ------MENU------");
        System.out.println("Option 1: Play");
        System.out.println("Option 2: How to Play");
        System.out.println("Option 3: Exit game");
        System.out.print("\nPlease select: ");
        options = scanner.nextInt();
        
        switch(options) {
            case 1:
                playGame();
                break;     
            case 2: 
                instructGame();
                break;
            case 3:
                exitGame();                
            default:
                System.out.println("Invalid option, please select again");
                showMenu();
        }
    }
    
    public void playGame() {
        System.out.println(" ");
        System.out.println("Starting game... ");
        
    }
    
    public void instructGame() {
        System.out.println(" ");
        System.out.println("Showing instructions... ");
    }
    
    public void exitGame() {
        System.out.println(" ");
        System.out.println("Exiting game... ");
    }
    
    public static void main(String[] args) {
        Hangman hgmenu = new Hangman();
        hgmenu.showMenu();
    }
       
}

    
