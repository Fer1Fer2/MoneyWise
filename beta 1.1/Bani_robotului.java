import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bani_robotului here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bani_robotului extends Actor
{
    public static int loc_robot;
    public int care_loc_robot;
    public int care_raspuns;
    public static int bani_robotului;
    
    public void act()
    {
        if(loc_robot < Player.locuri_folosite)
        {
            care_loc_robot = Greenfoot.getRandomNumber(7) + 1;
            care_locatie();
            loc_robot ++;
        }
    }
    
    public void care_locatie()
    {
        switch(care_loc_robot)
        {
            case 1://casa
                
                break;
            case 2://tel
                care_raspuns = Greenfoot.getRandomNumber(1) + 1;
                if(care_raspuns == 2)
                {
                    bani_robotului = bani_robotului - bani_robotului * 10 / 100;
                }else
                {
                    bani_robotului = bani_robotului - 10000;
                }
                break;
            case 3://haine
                care_raspuns = Greenfoot.getRandomNumber(1) + 1;
                if(care_raspuns == 2)
                {
                    bani_robotului = bani_robotului - bani_robotului * 15 / 100;
                }else
                {
                    bani_robotului = bani_robotului - 15000;
                }
                break;
            case 4://parc
                bani_robotului = bani_robotului - bani_robotului * 25 / 100;
                break;
            case 5://sala
                care_raspuns = Greenfoot.getRandomNumber(1) + 1;
                if(care_raspuns == 2)
                {
                    bani_robotului = bani_robotului - 15000;
                }else
                {
                    bani_robotului = bani_robotului - 20000;
                }
                break;
            case 6://buisines
                care_raspuns = Greenfoot.getRandomNumber(2) + 1;
                if(care_raspuns == 1)
                {
                    bani_robotului = bani_robotului + bani_robotului * 20 / 100;
                }else if(care_raspuns == 2)
                {
                    bani_robotului = bani_robotului + bani_robotului * 10 / 100;
                }else
                {
                    bani_robotului = bani_robotului - 10000;
                }
                break;
            case 7://banca
                care_raspuns = Greenfoot.getRandomNumber(1) + 1;
                if(care_raspuns == 2)
                {
                    bani_robotului = bani_robotului + bani_robotului * 25 / 100;
                }else
                {
                    bani_robotului = bani_robotului - bani_robotului * 25 / 100;
                }
                break;
            case 8://magazin
                bani_robotului = bani_robotului - 1000;
                break;
        }
    }
    
}
