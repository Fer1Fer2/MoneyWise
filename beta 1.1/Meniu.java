import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meniu extends Importante
{
    private int t_butoane = 0;
    
    public Meniu()
    {    
        prepare();
    }
    
    private void prepare()
    {
        Player.care_camera = "Meniu";
        Butoane butoane = new Butoane();
        addObject(butoane,190,520);
        Player.bani = 100000;
        Bani_robotului.bani_robotului = (Greenfoot.getRandomNumber(49) + 101) * 1000;
        Bani_robotului.loc_robot = 0;
    }
}
