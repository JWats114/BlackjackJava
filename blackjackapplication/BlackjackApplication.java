/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackjackapplication;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tredi
 */
public class BlackjackApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException 
    {
        // TODO code application logic here
    Scanner scnr = new Scanner(System.in);
    Deck deck = new Deck();
    System.out.println("Welcome to BlackJack would you like to play? (1 for Yes, 2 for No)");
    int gameChoice = scnr.nextInt();
    int userWins = 0;
    int houseWins = 0;
    int gameTies = 0;
    int numGames = 0;
    
    while (gameChoice == 1)
    { 
        ArrayList<Card> houseHand = new ArrayList();
        Card card1 = deck.drawCard();
        Card card2 = deck.drawCard();
        houseHand.add(card1);
        houseHand.add(card2);
        int houseTotal = card1.getValue() + card2.getValue();
        System.out.println();
        System.out.println("House is showing " + card2.getCard());
        
        ArrayList<Card> playerHand = new ArrayList();
        card1 = deck.drawCard();
        card2 = deck.drawCard();
        playerHand.add(card1);
        playerHand.add(card2);
        int playerTotal = 0;
        System.out.println("Player is showing " + card1.getCard() + " and " +card2.getCard());
        System.out.println();
        
        for(int i = 0;i < playerHand.size(); i++)
        {
            playerTotal = playerTotal + playerHand.get(i).getValue();
        }
        
        for(int i = 0; i < playerHand.size(); i++)
            {
                if("Ace".equals(playerHand.get(i).getTitle()) && playerTotal > 21)
                {
                    playerHand.get(i).setValue(1);
                    break;                    
                }
            }
        
        playerTotal = 0;
        for(int i = 0;i < playerHand.size(); i++)
        {
            playerTotal = playerTotal + playerHand.get(i).getValue();
        }
        System.out.println("Player Total: " + playerTotal);
        
        
        
        if(playerTotal < 21)
        {
            while(playerTotal < 21)
            {
                System.out.println("Would you like to hit or stand? (1 for hit, 2 for Stand)");
                int hit = scnr.nextInt();
                if(hit == 1)
                    {   
                    card1 = deck.drawCard();
                    playerTotal = 0;
                    playerHand.add(card1);
                    
                    
                    for(int i = 0; i < playerHand.size(); i++)
                    {
                        playerTotal = playerTotal + playerHand.get(i).getValue();
                    }
                    System.out.println("Player has recieved " + card1.getCard());
                    
                    
                    if(playerTotal > 21)
                    {
                        
                        for (int i = 0; i < playerHand.size(); i++) 
                        {
                            if ("Ace".equals(playerHand.get(i).getTitle()) && playerHand.get(i).getValue() == 11 && playerTotal > 21) 
                            {
                                playerHand.get(i).setValue(1);
                                break;
                            }
                        }
                    }
                    
                    playerTotal = 0;
                    for(int i = 0; i < playerHand.size(); i++)
                    {
                        playerTotal = playerTotal + playerHand.get(i).getValue();
                    }
                    System.out.println("New Player Total: " + playerTotal);
                    }
                else
                    {
                    break;
                    }
            }
            
            
        }
        
        if(playerTotal > 21)
        {
            System.out.println("Player has busted");
        }
        
        
        
        

        
        
        
        
        
        gameChoice = 2;
    }
    
    
    scnr.close();
    }
}
