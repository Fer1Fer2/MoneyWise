import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scris_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scris_1 extends Actor
{
    public Scris_1(String text)
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
