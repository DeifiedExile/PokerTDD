/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokertdd;

/**
 *
 * @author Lucas Wolfs <lwolfs@my.wctc.edu>
 */
public class Card {
    private String power;
    private String suit;
    public Card(String power, String suit)
    {
        this.power = power;
        this.suit = suit;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
    
}
