import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alegere_telefon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alegere_telefon extends Intrebari
{
    public Alegere_telefon()
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

            if(mouseX <= 830 && 
            mouseX >= 482 && 
            mouseY >= 226 && 
            mouseY <= 600)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Player.bani = Player.bani - 10000;
                    Player.locuri_folosite ++;
                    Greenfoot.setWorld(new Dormitor());
                }

            }
            else if(mouseX <= 393 && 
            mouseX >= 45 && 
            mouseY >= 226 && 
            mouseY <= 600)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Player.bani = Player.bani - Player.bani * (Greenfoot.getRandomNumber(5) + 11) / 100;
                    Player.locuri_folosite ++;
                    Greenfoot.setWorld(new Dormitor());
                }

            }
        }
    }
}
