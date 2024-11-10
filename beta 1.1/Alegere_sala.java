import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alegere_sala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alegere_sala extends Intrebari
{

    /**
     * Constructor for objects of class Alegere_sala.
     * 
     */
    public Alegere_sala()
    {
        Greenfoot.delay(2);
    }
    
    public void act()
    {
        ver_poz_mouse();
    }
    
    public void ver_poz_mouse()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if(mouse != null)
        {
            int mouseX = mouse.getX() , mouseY = mouse.getY();

            if(mouseX <= 922 && 
            mouseX >= 575 && 
            mouseY >= 169 && 
            mouseY <= 600)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Player.bani = Player.bani - 15000;
                    Player.locuri_folosite ++;
                    Greenfoot.setWorld(new Dormitor());
                }

            }
            else if(mouseX <= 478 && 
            mouseX >= 131 && 
            mouseY >= 169 && 
            mouseY <= 600)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Player.bani = Player.bani - (Greenfoot.getRandomNumber(14) + 11)*1000;
                    Player.locuri_folosite ++;
                    Greenfoot.setWorld(new Dormitor());
                }

            }
        }
    }
}
