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
public class PokerTDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Deck deck = new Deck();
        Hand hand = new Hand();
        HandTester tester = new HandTester();
        
        hand.drawHand(deck);
        
        System.out.println(tester.checkHand(hand.getCardsInHand()));
        
    }
    
}
