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
    public String checkHand(List<Card> cards)
    {
        String handType = "";
        if(checkRoyalFlush(cards))
        {
            handType = "Royal Flush";
        }
        else if(checkFlush(cards) && checkStraight(cards))
        {
            handType = "Straight Flush";
        }
        else if(checkFlush(cards))
        {
            handType = "Flush";
        }
        else if(checkStraight(cards))
        {
            handType = "Straight";
        }
        else if(checkFourOfAKind(checkOfAKind(cards)))
        {
            handType = "Four of A Kind";
        }
        else if(checkFullHouse(checkOfAKind(cards)))
        {
            handType = "Full House";
        }
        else if(checkThreeOfAKind(checkOfAKind(cards)))
        {
            handType = "Three of a Kind";
        }
        else if(checkTwoPair(checkOfAKind(cards)))
        {
            handType = "Two Pair";
        }
        else if(checkPair(checkOfAKind(cards)))
        {
            handType = "Pair";
        }
        else
        {

            cards.sort(Comparator.comparing(Card::getPower));
            handType = "High Card " + cards.get(4).toString();
        }
                
        return handType;
        
        
    }
    /**
     * checks if hand is a flush
     * @param cards list of cards to check
     * @return true if flush
     */
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
    /**
     * checks if hand is a straight
     * @param c list of cards to check
     * @return true if a straight
     */
    private boolean checkStraight(List<Card> c)
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
    /**
     * checks if there is a royal flush
     * @param c list of cards in hand
     * @return returns true if hand is a royal flush
     */
    private boolean checkRoyalFlush(List<Card> c)
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
    /**
     * counts number of matched cards in hand, stores in array
     * @param c list of cards to check
     * @return array of matches for each card
     */
    private int[] checkOfAKind(List<Card> c)
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
        

        return matchCount;
    }
    /**
     * checks if there is a 2pair
     * @param matchCount count of matched cards in hand
     * @return true if 2 pair
     */
    private boolean checkTwoPair(int[] matchCount)
    {
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
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * return true if hand has a 4 of a kind
     * @param matchCount count of matches
     * @return true if 4 of a kind
     */
    private boolean checkFourOfAKind(int[] matchCount)
    {
        for(int i : matchCount)
        {
            if(i==4)
            {
                return true;
            }
        }
        return false;
    }
    /**
     * checks of a three of a kind
     * @param matchCount array of matched cards
     * @return true if three of a kind
     */
    private boolean checkThreeOfAKind(int[] matchCount)
    {
        for(int i : matchCount)
        {
            if(i == 3)
            {
                return true;
            }
        }
        return false;
    }
    /**
     * checks for pair, fails if 2pair
     * @param matchCount array of match counts
     * @return true iff pair
     */
    private boolean checkPair(int[] matchCount)
    {
        int pairCount = 0;
        for(int i : matchCount)
        {
            if(i ==2)
            {
                pairCount++;
            }
        }
        if(pairCount < 3 && pairCount > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * checks if full house
     * @param matchCount array of match counts
     * @return true if full house
     */
    private boolean checkFullHouse(int[] matchCount)
    {
        if(checkThreeOfAKind(matchCount) && checkPair(matchCount))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
