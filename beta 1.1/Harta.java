import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Harta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Harta extends World
{

    /**
     * Constructor for objects of class Harta.
     * 
     */
    public Harta()
    {    
        super(1200, 600, 1);
        addObject(new Bani_robotului(),1090,58);
        addObject(new Nr_de_bani(),1160,74);
        addObject(new Bani(),850,50);
        addObject(new Nr_de_boni(),900,50);
    }
    
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if(mouse != null)
        {
            int mouseX = mouse.getX() , mouseY = mouse.getY();

            if(mouseX <= 923 && 
            mouseX >= 747 && 
            mouseY >= 167 && 
            mouseY <= 248)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Strada_buisnes());
                }
            }else if(mouseX <= 555 && 
            mouseX >= 385 && 
            mouseY >= 85 && 
            mouseY <= 177)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Strada_bank());
                }
            }else if(mouseX <= 853 && 
            mouseX >= 703 && 
            mouseY >= 441 && 
            mouseY <= 524)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Player.care_camera = "Meniu";
                    Greenfoot.setWorld(new Dormitor());
                }
            }else if(mouseX <= 1140 && 
            mouseX >= 966 && 
            mouseY >= 258 && 
            mouseY <= 342)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Strada_magazin());
                }
            }else if(mouseX <= 600 && 
            mouseX >= 437 && 
            mouseY >= 448 && 
            mouseY <= 533)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Park());
                }
            }else if(mouseX <= 401 && 
            mouseX >= 260 && 
            mouseY >= 509 && 
            mouseY <= 596)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Strada_tel());
                }
            }else if(mouseX <= 408 && 
            mouseX >= 263 && 
            mouseY >= 404 && 
            mouseY <= 485)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Strada_haine());
                }
            }else if(mouseX <= 247 && 
            mouseX >= 98 && 
            mouseY >= 269 && 
            mouseY <= 358)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Sala());
                }
            }
        }
    }
}
