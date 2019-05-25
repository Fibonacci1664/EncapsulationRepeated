package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        // This code is for the Player class which is the class created to demonstrate a class without
        // proper encapsulation.

//        Player player = new Player();
//
//        player.fullName = "Dave";
//        player.weapon = "Sword";
//        player.health = 20;
//
//        int damage = 10;
//
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 100;
//
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());


        EnhancedPlayer player = new EnhancedPlayer("Dave", 200, "Sword");

        System.out.println("Initial health is " + player.getHealth());
    }
}
