/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackapplication;

/**
 *
 * @author tredi
 */
public class Deck {
    public Card drawCard(){
        String suit = null;
        String title = null;
        
        int value = ((int)(Math.random()*13 + 1));
        int suitNum = ((int)(Math.random()*4)+1);
        
        
        switch (suitNum){
            case 1:
            suit = "Spades";
            break;
            case 2:
            suit = "Clubs";
            break;
            case 3:
            suit = "Hearts";
            break;
            case 4:
            suit = "Diamonds";
            break;
        }
        
        switch (value)
        {
            case 1:
                title = "Ace";
                break;
            case 11:
                title = "Jack";
                break;
            case 12:
                title = "Queen";
                break;
            case 13:
                title = "King";
                break;
        }
        return new Card(value, suit, title);
    }
}
