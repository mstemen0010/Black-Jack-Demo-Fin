/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.winterrmute.cardgames.type52.entity.cardgame;

/**
 *
 * @author Mathias
 */
public interface CardGame {
    
    
    enum CardType {
        FiftyTwo,
        Magic;
     }
    
    
    void printTurn();
    
    void printStats();
    
}
