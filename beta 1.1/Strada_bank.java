import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Strada_bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Strada_bank extends World
{

    /**
     * Constructor for objects of class Strada_bank.
     * 
     */
    public Strada_bank()
    {    
        super(1200, 600, 1);
        addObject(new Bani_robotului(),1090,58);
        addObject(new Nr_de_bani(),1160,74);
        addObject(new Bani(),850,50);
        addObject(new Nr_de_boni(),900,50);
    }
    
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if(mouse != null)
        {
            int mouseX = mouse.getX() , mouseY = mouse.getY();

            if(mouseX <= 983 && 
            mouseX >= 687 && 
            mouseY >= 325 && 
            mouseY <= 499)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Banca());
                }
            }
        }
    }
}
