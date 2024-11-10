import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bucatarie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bucatarie extends Casa
{

    /**
     * Constructor for objects of class Bucatarie.
     * 
     */
    public Bucatarie()
    {    
        prepare();
    }
    
    private void prepare()
    {
        Player.care_camera = "Bucatarie";
        addObject(new Player(),100,500);
    }
    
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if(mouse != null)
        {
            int mouseX = mouse.getX();

            if(mouseX <= 200)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Hol());
                }

            }
        }
    }
}
