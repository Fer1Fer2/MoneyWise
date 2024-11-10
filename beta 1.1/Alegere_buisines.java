import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alegere_buisines here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alegere_buisines extends Intrebari
{
    public static int care;
    
    public Alegere_buisines()
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

            if(mouseX <= 1191 && 
            mouseX >= 849 && 
            mouseY >= 151 && 
            mouseY <= 600)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    care = 1;
                    Player.bani = Player.bani + Player.bani * 10 / 100;
                    Player.locuri_folosite ++;
                    Greenfoot.setWorld(new Choises());
                }

            }
            else if(mouseX <= 768 && 
            mouseX >= 427 && 
            mouseY >= 151 && 
            mouseY <= 600)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    care = 2;
                    Player.bani = Player.bani - Player.bani * 15 / 100;
                    Player.locuri_folosite ++;
                    Greenfoot.setWorld(new Choises());
                }

            }
            else if(mouseX <= 353 && 
            mouseX >= 13 && 
            mouseY >= 151 && 
            mouseY <= 600)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    care = 3;
                    Player.bani = Player.bani + Player.bani * 25 /100;
                    Player.locuri_folosite ++;
                    Greenfoot.setWorld(new Choises());
                }

            }
        }
    }
}
