import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banca extends Strada_bank
{

    /**
     * Constructor for objects of class Banca.
     * 
     */
    public Banca()
    {    
        addObject(new Scris_1("Would you be interested in depositing your funds with us?"),500,510);
        addObject(new Scris_2("Please let me know the amount you wish to deposit"),500,550);
        addObject(new Scris_3("and I will provide you with the applicable interest rate and available deposit periods"),500,590);
    }
    
    public void act()
    {
        mouse();
    }
    
    public void mouse()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if(mouse != null)
        {
            if(Greenfoot.mouseClicked(this))
            {
                Greenfoot.setWorld(new Alegere_banca());
            }
        }
    }
}
