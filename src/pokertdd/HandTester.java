/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokertdd;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Lucas Wolfs <lwolfs@my.wctc.edu>
 */
public class HandTester {
    public Boolean checkHand(List<Card> cards)
    {
        return checkFlush(cards);
        
    }
    
    private boolean checkFlush(List<Card> cards)
    {
        boolean flush = false;

        for(int i = 0; i < cards.size()-1; i++)
        {
            if(cards.get(i).getSuit().equalsIgnoreCase(cards.get(i+1).getSuit()))
            {
                flush = true;
            }
            else
            {
                flush = false;
            }
        }
        return flush;
    }
    public boolean checkStraight(List<Card> cards)
    {
        boolean straight = false;
        cards.sort(Comparator.comparing(Card::getPower));
        for(int i = 0; i < cards.size()-1; i++)
        {
            if(cards.get(i).getPower() == cards.get(i+1).getPower()-1)
            {
                straight = true;
            }
            else
            {
                straight = false;
            }
        }
        return straight;
    }
    
}
