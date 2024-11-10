import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Story here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story extends Importante
{

    /**
     * Constructor for objects of class Story.
     * 
     */
    public void act()
    {    
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if(mouse != null)
        {
            int mouseX = mouse.getX() , mouseY = mouse.getY();

            if(mouseX <= 810 && 
            mouseX >= 606 && 
            mouseY >= 540 && 
            mouseY <= 580)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Meniu());
                }
            }
        }
    }
}
