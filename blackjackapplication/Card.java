/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackapplication;

/**
 *
 * @author tredi
 */
public class Card 
{
    private int value;
    private String suit;
    private String title;

    
    public Card (int value, String suit, String title)
    {      
        if(value == 1)
        {
            this.value = 11;
            this.title = "Ace";
        }
        else if(value == 11)
        {
            this.value = 10;
            this.title = "Jack";
        }
        else if(value == 12)
        {
            this.value = 10;
            this.title = "Queen";
        }
        else if(value == 13)
        {
            this.value = 10;
            this.title = "King";
        }
        else
        {
            this.value = value;
            this.title = Integer.toString(value);
        }
        
        this.suit = suit;
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public int getValue()
    {
        return this.value;
    }
    
    public void setValue(int value)
    {
        this.value = value;
    }
    
    public String getCard()
    {
        return this.title + " of " + this.suit;
    }
}