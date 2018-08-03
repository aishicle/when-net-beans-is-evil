package hangmangame;

import java.util.Scanner;

/* @author Aish */
public class Hangman {
    Scanner scanner = new Scanner(System.in);
    
    public void showMenu () {
        int options;
        
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
                break;
            default:
                System.out.println("Invalid option, please select again");
                showMenu();
        }
    }
    
    public void playGame() {
        System.out.println(" ");
        System.out.println("Starting game... ");        
            
        int i, point = 0;
        String word = "australia";
        String input, guess;
        
        input = scanner.nextLine();
        
        do {
            for(i=0; i<word.length(); i++) {
                if (word.charAt(i)==input.charAt(0)) {
                point = 1;
                }
            }
                
            if(point == 1) {
                System.out.println("Letter is present in word!");
                } else {
                 System.out.println("Letter is not present");
                }
            
            System.out.println("Would you like another guess? (Yes/No): ") ;
            guess = scanner.nextLine();
            point = 0;

        } while (guess.equals("Yes") || guess.equals("No"));           
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

    
