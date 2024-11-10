import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Butoane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Butoane extends Actor
{
    public boolean asteptare_buton = false;
    
    
    public void act()
    {
        verificare_poz_mouse();
        aparitie();
    }
    
    public void aparitie()
    {
        if(!asteptare_buton)
        {
            Greenfoot.delay(50);
            asteptare_buton = true;
        }
        
        if(getY() > 155)
        {
            setLocation(getX() , getY() - 3);
        }
    }
    
    public void verificare_poz_mouse()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if(mouse != null)
        {
            int mouseX = mouse.getX() , mouseY = mouse.getY();

            if(mouseX <= getX() + 120 && 
            mouseX >= getX() - 10 && 
            mouseY >= getY() + 81 && 
            mouseY <= getY() + 127)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Player.locuri_folosite = 0;
                    Greenfoot.setWorld(new Informati());
                }
            }
            else if(mouseX <= getX() + 120 && 
            mouseX >= getX() - 10 && 
            mouseY >= getY() + 286 && 
            mouseY <= getY() + 343)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    System.exit(0);
                }

            }else if(mouseX <= getX() + 132 && 
            mouseX >= getX() + 9 && 
            mouseY >= getY() + 157 && 
            mouseY <= getY() + 195)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Story());
                }

            }else if(mouseX <= getX() + 121 && 
            mouseX >= getX() - 46 && 
            mouseY >= getY() + 227 && 
            mouseY <= getY() + 269)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Info());
                }

            }
        }
    }
}