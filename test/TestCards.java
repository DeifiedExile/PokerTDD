/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pokertdd.Card;
import pokertdd.Deck;
import pokertdd.Hand;

/**
 *
 * @author Lucas Wolfs <lwolfs@my.wctc.edu>
 */
public class TestCards {
    Card card;
    Hand hand;
    Deck deck;
    public TestCards() {
    }
  
    @Before
    public void setUp() {
        int power = 2;
        String suit = "Clubs";
        card = new Card(power, suit);
        hand = new Hand();
        deck = new Deck();
    }

    @Test
    public void canGenerateRandomCard()
    {
        deck.drawCard();
    }
    @Test
    public void canDrawHand()
    {
        hand.drawHand(deck);
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
