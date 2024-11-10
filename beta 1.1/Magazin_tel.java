import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Actor;

/**
 * Write a description of class ruvbpaifujuv here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Magazin_tel extends Strada_tel
{
    public Magazin_tel()
    {    
        addObject(new Scris_1("Hello! Would you be interested in purchasing a brand-new phone"),500,510);
        addObject(new Scris_2("equipped with cutting-edge features"),500,550);
        addObject(new Scris_3("designed to support you every step of the way on your journey?"),500,590);
    }
    
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if(mouse != null)
        {
            if(Greenfoot.mouseClicked(this))
            {
                Greenfoot.setWorld(new Alegere_telefon());
            }
        }
    }
}
