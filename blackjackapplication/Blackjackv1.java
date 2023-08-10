/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackapplication;

/**
 *
 * @author tredi
 */
public class Blackjackv1 {
    /*
    Scanner scnr = new Scanner(System.in);
    Deck deck = new Deck();
    System.out.println("Welcome to BlackJack would you like to play? (1 for Yes, 2 for No)");
    int gameChoice = scnr.nextInt();
    int userWins = 0;
    int houseWins = 0;
    int gameTies = 0;
    int numGames = 0;
    while (gameChoice == 1){    
        int houseTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
        int playerTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
        numGames++;
        System.out.println("The House is showing: " + houseTotal);
    
        while ( playerTotal <= 21)
        {
            Thread.sleep(500);
            System.out.println("Player is showing: " + playerTotal);
            System.out.println("Would you like to hit or stand?\n\tEnter 1 for hit or 0 for stand: ");
            int choice = scnr.nextInt();
            if (choice == 0) 
            {
                break;
            } 
            else if (choice == 1) 
            {
                Card nextCard = deck.drawCard();
                Thread.sleep(500);
                System.out.println("Player draws the " + nextCard.declareCard());
                playerTotal += nextCard.getValue(true);
            }
            else 
            {
            System.out.println("Invalid option, try again");
            }
        }
    
        if (playerTotal > 21) 
        {
            System.out.println("The Player has busted!");
        } 
        else 
        {
            System.out.println("\nThe Player stands with " + playerTotal + " points.");
            Thread.sleep(500);
            System.out.println("The house will play next.");
            Thread.sleep(500);
            System.out.println("The House is showing: " + houseTotal);
                if (houseTotal < 17)
                    {
                    Card newCard = deck.drawCard();
                    Thread.sleep(500);
                    System.out.println("House draws the " + newCard.declareCard());
                    houseTotal += newCard.getValue(true);
                    Thread.sleep(500);
                    System.out.println("The House is showing: " + houseTotal);
                    }
                else if (houseTotal >= 17 && houseTotal <= 21)
                    {
                    System.out.println("The house will stand with: " + houseTotal);
                    }
                else if (houseTotal > 21)
                    {   
                    System.out.println("The house has busted!");
                    }
        
        }
    
    System.out.println("Game Results!");
    if (houseTotal > 21 && playerTotal <= 21)
    {
        System.out.println("The house busted. The Player wins.");
        userWins++;
    }
    else if (playerTotal > 21)
    {
        System.out.println("The house wins.");
        houseWins++;
    }
    else if (houseTotal <= 21 && houseTotal > playerTotal)
    {
        System.out.println("The house had a greater value. The house wins.");
        houseWins++;
    }
    else if (playerTotal > houseTotal && playerTotal <= 21)
    {
        System.out.println("The Player had greater value. The Player wins.");
        userWins++;
    }
    else if (playerTotal == houseTotal && playerTotal <= 21)
    {
        System.out.println("The Player has the same value as the house. Its a tie.");
        gameTies++;
    }
       System.out.println("Would you like to play again? (1 for Yes, 2 for No)");

    int gameChoice2 = scnr.nextInt();
    gameChoice = gameChoice2;
}
    System.out.println();
    System.out.println("Total number of Games: " + numGames);
    Thread.sleep(500);
    System.out.println("Total number of Player Wins: " + userWins);
    Thread.sleep(500);
    System.out.println("Total number of House Wins: " + houseWins);
    Thread.sleep(500);
    System.out.println("Total number of ties: " + gameTies);
    scnr.close();
    
    */
}
