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
import pokertdd.Hand;

/**
 *
 * @author Lucas Wolfs <lwolfs@my.wctc.edu>
 */
public class TestCards {
    Card card;
    public TestCards() {
    }
  
    @Before
    public void setUp() {
        String power = "2";
        String suit = "Clubs";
        card = new Card(power, suit);
    }
    @Test
    public void canCreateHand()
    {
        Hand hand = new Hand();
    }
    @Test
    public void canGetCardInfo()
    {
        
        assertEquals("wrong","2", card.getPower());
        assertEquals("wrong", "Clubs", card.getSuit());
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
