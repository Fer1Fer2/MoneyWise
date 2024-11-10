import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nr_de_bani here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nr_de_bani extends Bani_robotului
{
    private int memorie;
    
    public Nr_de_bani()
    {
        memorie = bani_robotului;
        GreenfootImage img = new GreenfootImage(100, 30);
        img.drawString("" + bani_robotului, 2, 20);
        img.scale(200, 100);
        setImage(img);
    }
    
    public void act()
    {
        if(memorie != bani_robotului)
        {
            inoire();
        }
    }
    
    public void inoire()
    {
        memorie = bani_robotului;
        GreenfootImage img = new GreenfootImage(100, 30);
        img.drawString("" + bani_robotului, 2, 20);
        img.scale(200, 100);
        setImage(img);
    }
}
