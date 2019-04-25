/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import pokertdd.Card;
import pokertdd.Deck;
import pokertdd.Hand;
import pokertdd.HandTester;

/**
 *
 * @author Lucas Wolfs <lwolfs@my.wctc.edu>
 */
public class TestCards {
    Card card;
    Hand hand;
    Deck deck;
    HandTester tester;
    public TestCards() {
    }
  
    @Before
    public void setUp() {
        int power = 2;
        String suit = "Clubs";
        card = new Card(power, suit);
        hand = new Hand();
        deck = new Deck();
        tester = new HandTester();
        hand.drawHand(deck);
    }

    @Test
    public void canGenerateRandomCard()
    {
        deck.drawCard();
    }
    @Ignore
    @Test
    public void canDrawHand()
    {
        hand.drawHand(deck);
    }
    
    @Test
    public void canGetCardsInHad()
    {
        for(Card c : hand.getCardsInHand())
        {
            assertEquals(c.getClass(), Card.class);
            assertTrue(c instanceof Card);
           // System.out.println(c.toString());
        }
        
    }
    

    
    @Test
    public void canCheckFlush()
    {       
        assertEquals("wrong", true, tester.checkHand(hand.getCardsInHand()));
    }
    
    

    @Test
    public void canCheckStraight()
    {
        
        assertEquals("wrong", true, tester.checkStraight(hand.getCardsInHand()));
    }
    
    @Test
    public void canCheckRoyalFlush()
    {
        assertEquals("wrong", true, tester.checkRoyalFlush(hand.getCardsInHand()));
    }
    
    @Test
    public void canCheckOfAKind()
    {
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(1, "Hearts"));
        cards.add(new Card(1, "Clubs"));
        cards.add(new Card(2, "Spades"));
        cards.add(new Card(2, "Diamonds"));
        cards.add(new Card(3, "Spades"));
        
        assertEquals("wrong", 3, tester.checkOfAKind(cards));
        
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
