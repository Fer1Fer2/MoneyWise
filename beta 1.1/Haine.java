import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Haine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Haine extends Strada_haine
{

    /**
     * Constructor for objects of class Haine.
     * 
     */
    public Haine()
    {
        addObject(new Scris_1("Hey there! How about adding some fresh, stylish pieces to your wardrobe?"),500,540);
        addObject(new Scris_2("Our latest collection is designed to keep you looking sharp and feeling confident,"),500,570);
        addObject(new Scris_3(" no matter where your journey takes you!"),500,610);        
    }
    
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if(mouse != null)
        {
            if(Greenfoot.mouseClicked(this))
            {
                Greenfoot.setWorld(new Alegere_haine());
            }
        }
    }
}
