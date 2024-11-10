import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poveste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poveste extends Importante
{

    /**
     * Constructor for objects of class Poveste.
     * 
     */
    public void act ()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Dormitor());
        }
    }
}
