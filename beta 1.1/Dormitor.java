import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dormitor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dormitor extends Casa
{

    /**
     * Constructor for objects of class Dormitor.
     * 
     */
    public Dormitor()
    {
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        if(Player.care_camera == "Hol")
        {
            addObject(new Player(),1150,Player.y_schimb);
        }else
        {
            addObject(new Player(),100,500);
        }
        Player.care_camera = "Dormitor";
    }
    
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if(mouse != null)
        {
            int mouseX = mouse.getX();

            if(mouseX >= 1000)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Hol());
                }

            }
        }
    }
}
