/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playingcards;

/**
 *
 * @author 
 */  
public enum Rank {  //enumarated type of class that is an easier way of listing values in sequential order.
    ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king;

    /**
     *
     * @param args
     */ 
    public static void main(String [] args) {   
        Rank highCard;  //creates a Rank type object for the high card 
        Rank faceCard;   //variable for the face card of your choice
        Rank card1;   //variable for the first card with value of your choice
        Rank card2;   //variable fo rcard two of your choice 
        
        
        highCard = ace;   //set highcard as ace 
        faceCard = king ;  //sets facecard of your choice as king
        card1 = ten;   //sets the first card of your choice as ten 
        card2 = two;  //sets the second card of your choice as two 
        
        
        //prints out A blackjack hand: ace and king 
        System.out.println("A blackjack hand: " + highCard + " and " + faceCard);
        
        int card1val = 10;  //create integer representation of the rank type varaible card 1
       
        int card2val = 2; //create integer representation of the rank type varaible card 2
        
        int sum = card2val + card1val;   //get the sum of the two card face values.
        
        System.out.println("A two card hand: "+ card1 + " and " + card2);
        
        System.out.println("Hand value: " + sum);
        
        
        
        
        
    
}








}
