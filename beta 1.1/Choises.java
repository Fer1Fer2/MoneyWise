import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Choises here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Choises extends Alegere_buisines
{
    GreenfootImage first = new GreenfootImage("1.jpg");
    GreenfootImage second = new GreenfootImage("2.jpg");
    GreenfootImage third = new GreenfootImage("3.jpg");
    
    public Choises()
    {
        switch(Alegere_buisines.care)
        {
            case 1:
                setBackground(first);
                break;
            case 2:
                setBackground(second);
                break;
            case 3:
                setBackground(third);
                break;
        }
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Dormitor());
        }
    }
}
