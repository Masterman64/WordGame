/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jjoneswordgame;

import javax.swing.JOptionPane;

/**
 *
 * @author Thema
 */
public class JJonesWordGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Tells the user how the game works
        JOptionPane.showMessageDialog(null, "Welcome to the Word Game! Enter the following information, and then see the result!");
        
        //Receives the required information from the user
        String name = JOptionPane.showInputDialog(null, "What is your name?");
        String age = JOptionPane.showInputDialog(null, "How old are you?");
        String city = JOptionPane.showInputDialog(null, "Name a city");
        String college = JOptionPane.showInputDialog(null, "Name a college");
        String job = JOptionPane.showInputDialog(null, "Name a job or profession");
        String animal = JOptionPane.showInputDialog(null, "Name an animal");
        String pet = JOptionPane.showInputDialog(null, "What name would you give a pet?");
        
        //Puts all of the information into the story
        String message = "There once was a person named " + name + " who lived in " + city + ". ";
        message += "When they were " + age + " , " + name + " went to college at " + college + ".\n";
        message += name + " then graduated and went to work as a " + job + ". ";
        message += "Then, " + name + " adopted a(n) " + animal + " named " + pet + ".\n";
        message += "They then both lived hapilly ever after.\nThe End.";
        
        //Shows the message
        JOptionPane.showMessageDialog(null, message);
        
        //Ends the program
        System.exit(0);
    }
    
}
