import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Informati here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Informati extends Importante
{

    /**
     * Constructor for objects of class Informati.
     * 
     */
    public void act()
    {
    
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if(mouse != null)
        {
            int mouseX = mouse.getX() , mouseY = mouse.getY();

            if(mouseX <= 595 && 
            mouseX >= 226 && 
            mouseY >= 550 && 
            mouseY <= 600)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Poveste());
                }
            }
        }
    }
}