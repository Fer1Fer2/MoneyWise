import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Casa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casa extends World
{

    /**
     * Constructor for objects of class Casa.
     * 
     */
    public Casa()
    {    
        super(1200, 600, 1);
        addObject(new Bani_robotului(),1090,58);
        addObject(new Nr_de_bani(),1160,74);
        addObject(new Bani(),850,50);
        addObject(new Nr_de_boni(),900,50);
        GreenfootSound music = new GreenfootSound("background.mp3");
        music.playLoop();
    }
}
