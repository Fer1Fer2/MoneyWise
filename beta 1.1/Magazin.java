import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Magazin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Magazin extends Strada_magazin
{

    /**
     * Constructor for objects of class Magazin.
     * 
     */
    public Magazin()
    {
        addObject(new Scris_2("Looking for the best prices on healthy foods?"),500,550);
    }
    
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if(mouse != null)
        {
            if(Greenfoot.mouseClicked(this))
            {
                Greenfoot.setWorld(new Alegere_magazin());
            }
        }
    }
}
