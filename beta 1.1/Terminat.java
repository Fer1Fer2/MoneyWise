import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Terminat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Terminat extends World
{
    GreenfootImage good = new GreenfootImage("Final_A.jpg");
    GreenfootImage bad = new GreenfootImage("Final_F.jpg");
    GreenfootImage medium = new GreenfootImage("Final_B.jpg");
    GreenfootImage ultim = new GreenfootImage("Final.jpeg");
    public Terminat()
    {    
        super(1200, 600, 1); 
        if(Player.bani >= 150000)
        {
            setBackground(good);
        }
        else if(Player.bani <= 50000)
        {
            setBackground(bad);
        }
        else
        {
            setBackground(medium);
        }
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            setBackground(ultim);
        }
    }
}
