import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Importante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Importante extends World
{

    /**
     * Constructor for objects of class Importante.
     * 
     */
    public Importante()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        GreenfootSound music = new GreenfootSound("background.mp3");
        music.playLoop();
    }
}
