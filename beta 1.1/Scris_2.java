import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scris_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scris_2 extends Actor
{
    public Scris_2(String text)
    {
        GreenfootImage img = new GreenfootImage(500,50);
        img.drawString(text, 0, 20);
        setImage(img);
        img.scale(700,100);
        setImage(img);
    }
    
    
    public void act()
    {
        // Add your action code here.
    }
}

