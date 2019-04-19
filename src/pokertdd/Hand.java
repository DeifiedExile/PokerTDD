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
    public void drawHand(Deck deck)
    {
        for(int i = 0; i < 5; i++)
        {
            cardsInHand.add(deck.drawCard());
        }
    }
}
