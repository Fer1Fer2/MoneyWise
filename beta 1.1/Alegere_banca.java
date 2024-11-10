import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alegere_banca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alegere_banca extends Intrebari
{
    public static boolean imprumut = true;
    public static boolean depozit = true;
    
    public Alegere_banca()
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

            if(mouseX <= 763 && 
            mouseX >= 423 && 
            mouseY >= 192 && 
            mouseY <= 600)
            {
                if(Greenfoot.mouseClicked(this) && depozit == true)
                {
                    Player.bani = Player.bani - Player.bani * 25 / 100;
                    Player.locuri_folosite ++;
                    imprumut = false;
                    Greenfoot.setWorld(new Dormitor());
                }
            }
            else if(mouseX <= 350 && 
            mouseX >= 131 && 
            mouseY >= 192 && 
            mouseY <= 600)
            {
                if(Greenfoot.mouseClicked(this) && imprumut == true)
                {
                    Player.bani = Player.bani + Player.bani * 25 / 100;
                    Player.locuri_folosite ++;
                    imprumut = false;
                    Greenfoot.setWorld(new Dormitor());
                }
            }
        }
    }
}
