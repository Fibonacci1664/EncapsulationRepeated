package com.davegreen;

/**
 * Created by daveg on 23/06/2017.
 */

// Class with encapsulation, as you can see the fields are public which could allow unwanted access from outwith
// class itself.
public class Player
{
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage)
    {
        this.health = this.health - damage;
        if(this.health <= 0)
        {
            System.out.println("Player knocked out!");
        }
    }

    public int healthRemaining()
    {
        return this.health;
    }
}
