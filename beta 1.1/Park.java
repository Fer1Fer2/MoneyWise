import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Park here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Park extends World
{

    /**
     * Constructor for objects of class Park.
     * 
     */
    public Park()
    {    
        super(1200, 600, 1);
        addObject(new Bani_robotului(),1090,58);
        addObject(new Nr_de_bani(),1160,74);
        addObject(new Bani(),850,50);
        addObject(new Nr_de_boni(),900,50);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Player.locuri_folosite ++;
            Greenfoot.setWorld(new Furt());
        }
    }
}
