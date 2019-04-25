/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokertdd;

import java.util.ArrayList;
import java.util.Arrays;
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
    
    public boolean checkStraight(List<Card> c)
    {
        boolean straight = false;
        List<Card> cards = c;
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
    public boolean checkRoyalFlush(List<Card> c)
    {
        boolean rf = false;
        List<Card> cards = c;
        cards.sort(Comparator.comparing(Card::getPower));
        if(checkFlush(cards) && checkStraight(cards) && cards.get(4).getPower() == 13)
        {
            rf = true;
        }
        return rf;
    }
    
    public int checkOfAKind(List<Card> c)
    {
        int[] matchCount = {1,1,1,1,1};
        
        List<Card> cards = c;
        cards.sort(Comparator.comparing(Card::getPower));
        for(int i = 0; i < cards.size(); i++)
        {
            for(int j = 0; j < cards.size(); j++)
            {
                if( cards.get(i).getPower() == cards.get(j).getPower() && i != j)
                {
                    matchCount[i]++;
                }
            }
        }
        
        Arrays.sort(matchCount);
        int pairCount = 0;
        for(int i : matchCount)
        {
            if(i == 2)
            {
                pairCount++;
            }
        }
        if(pairCount == 4)
        {
            System.out.println("2 pair");
        }

        return matchCount[4];
    }
    
//    public int pairCount(List<Card> c)
//    {
//        
//    }
    
}
