import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alegere_haine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alegere_haine extends Intrebari
{
    public Alegere_haine()
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

            if(mouseX <= 862 && 
            mouseX >= 518 && 
            mouseY >= 225 && 
            mouseY <= 600)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Player.bani = Player.bani - 15000;
                    Player.locuri_folosite ++;
                    Greenfoot.setWorld(new Dormitor());
                }

            }
            else if(mouseX <= 392 && 
            mouseX >= 46 && 
            mouseY >= 225 && 
            mouseY <= 600)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Player.bani = Player.bani - Player.bani * (Greenfoot.getRandomNumber(14) + 7) / 100;
                    Player.locuri_folosite ++;
                    Greenfoot.setWorld(new Dormitor());
                }

            }
        }
    }
}
