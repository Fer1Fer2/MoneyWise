import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hol extends Casa
{
    
    
    public Hol()
    {    
        prepare();
    }
    
    private void prepare()
    {
        switch(Player.care_camera)
        {
            case "Dormitor":
                addObject(new Player(),50,Player.y_schimb);
                break;
            case "Bucatarie":
                addObject(new Player(),270,500);
                break;
            case "Strada":
                addObject(new Player(),890,500);
        }
            Player.care_camera = "Hol";
    }
    
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if(mouse != null)
        {
            int mouseX = mouse.getX() , mouseY = mouse.getY();

            if(mouseX <= 400 && 
            mouseX >= 140 && 
            mouseY >= 24 && 
            mouseY <= 528)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Bucatarie());
                }

            }
            else if(mouseX <= 1020 && 
            mouseX >= 760 && 
            mouseY >= 28 && 
            mouseY <= 520)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Player.care_camera = "altceva";
                    Greenfoot.setWorld(new Harta());
                }

            }
            else if(mouseX <=140)
            {
                if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Dormitor());
                }
            }
        }
    }
}
