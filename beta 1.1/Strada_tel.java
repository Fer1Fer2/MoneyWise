import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Strada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Strada_tel extends World
{

    /**
     * Constructor for objects of class Strada.
     * 
     */
    public Strada_tel()
    {    
        super(1200, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
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

            if(mouseX <= 1005 && 
            mouseX >= 728 && 
            mouseY >= 325 && 
            mouseY <= 499)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Magazin_tel());
                }
            }
        }
    }
}
