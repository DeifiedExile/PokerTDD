/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokertdd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas Wolfs <lwolfs@my.wctc.edu>
 */
public class Hand {
    
    List<Card> cardsInHand = new ArrayList<Card>();
    /**
     * Draws a hand of 5 cards from the provided deck
     * @param deck deck to draw cards from
     */
    public void drawHand(Deck deck)
    {
        for(int i = 0; i < 5; i++)
        {
            cardsInHand.add(deck.drawCard());
        }
//        for(Card c : cardsInHand)
//        {
//            System.out.println(c.getSuit() + " " + c.getPower());
//        }
    }
    
    
    /**
     * returns a List of cards in hand
     * @return List of cards to return
     */
    public List<Card> getCardsInHand()
    {
        return cardsInHand;
    }
}

