import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buisnes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buisnes extends Strada_buisnes
{

    /**
     * Constructor for objects of class Buisnes.
     * 
     */
    public Buisnes()
    {
        addObject(new Scris_1("Would you like to proceed with an investment in our business center?"),500,520);
        addObject(new Scris_2("Please indicate the amount you wish to invest,"),500,560);
        addObject(new Scris_3(" and I will provide you with the projected return percentage and investment period details."),500,600);
    }
    
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if(mouse != null)
        {
            if(Greenfoot.mouseClicked(this))
            {
                Greenfoot.setWorld(new Alegere_buisines());
            }
        }
    }
}
