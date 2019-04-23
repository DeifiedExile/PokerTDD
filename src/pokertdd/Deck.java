/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokertdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Lucas Wolfs <lwolfs@my.wctc.edu>
 */
public class Deck {
    private List<Card> deckList = new ArrayList<Card>();
    Random rand = new Random();
    
    
    /**
     * Constructor for Deck. Populates a 52 card deck with 13 cards for each suit, 1-10, jack, queen, king.
     */
    public Deck()
    {
        for(int i = 0; i < 13; i++)
        {
            deckList.add(new Card(i+1, "Hearts"));
            deckList.add(new Card(i+1, "Spades"));
            deckList.add(new Card(i+1, "Clubs"));
            deckList.add(new Card(i+1, "Diamonds"));
           
                    
        }
    }
    
    /**
     * selects a random card from the deck and returns it whilst simultaneously removing if from the deck
     * @return Card object
     */
    public Card drawCard()
    {
        //System.out.println("" + deckList.size());
        int randIndex = rand.nextInt(deckList.size());
        
        return deckList.remove(randIndex);
        
    }
}
