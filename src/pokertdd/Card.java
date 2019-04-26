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
public class Card implements Comparable{
    private int power;
    private String suit;
    public Card(int power, String suit)
    {
        this.power = power;
        this.suit = suit;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
    
    public String toString()
    {
        String faceValue = "";
        switch(this.getPower())
        {
            case 13: 
                faceValue = "King";
                break;
            case 12:
                faceValue = "Queen";
                break;
            case 11:
                faceValue = "Jack";
                break;
            default:
                faceValue = Integer.toString(this.getPower());
        }
        return (faceValue + " " + this.getSuit());
    }

    @Override
    public int compareTo(Object o) {
        Card c2 = (Card)o;
        if(this.getPower() >= c2.getPower())
        {
            return 1;
        }
        else if(this.getPower() <= c2.getPower())
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
    
}
