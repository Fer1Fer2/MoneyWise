import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Furt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Furt extends Park
{

    /**
     * Constructor for objects of class Furt.
     * 
     */
    public Furt()
    {
        Player.bani = Player.bani - Player.bani * 30 / 100;
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Dormitor());
        }
    }
}
