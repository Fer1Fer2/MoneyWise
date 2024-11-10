import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alegere_magazin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alegere_magazin extends Intrebari
{
    public Alegere_magazin()
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

            if(mouseX <= 478 && 
            mouseX >= 131 && 
            mouseY >= 154 && 
            mouseY <= 595)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Player.bani = Player.bani - 5000;
                    Player.locuri_folosite ++;
                    Greenfoot.setWorld(new Dormitor());
                }
            }
        }
    }
}
