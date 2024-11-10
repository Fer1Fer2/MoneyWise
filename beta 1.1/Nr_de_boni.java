import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nr_de_boni here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nr_de_boni extends Bani
{ 
    public Nr_de_boni()
    {
        GreenfootImage img = new GreenfootImage(50,25);
        img.drawString("" + Player.bani, 2, 20);
        setImage(img);
        img.scale(100,75);
        setImage(img);
    }
    public void act()
    {
        GreenfootImage img = new GreenfootImage(50,25);
        img.drawString("" + Player.bani, 2, 20);
        setImage(img);
        img.scale(100,75);
        setImage(img);
    }
}
