import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sala extends World
{

    /**
     * Constructor for objects of class Sala.
     * 
     */
    public Sala()
    {    
        super(1200, 600, 1);
        addObject(new Bani_robotului(),1090,58);
        addObject(new Nr_de_bani(),1160,74);
        addObject(new Bani(),850,50);
        addObject(new Nr_de_boni(),900,50);
        addObject(new Scris_1("Would you like to sign up for a membership?"),500,510);
        addObject(new Scris_3("We offer options for one month or longer—just let us know which suits you best!"),500,550);
    }
    
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if(mouse != null)
        {
            if(Greenfoot.mouseClicked(this))
            {
                Greenfoot.setWorld(new Alegere_sala());
            }
        }
    }
}
