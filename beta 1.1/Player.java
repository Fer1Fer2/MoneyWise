import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public int x_viteza;
    public int y_viteza;
    public int s_putere = 50;
    public int y_podea = 450;
    public static String care_camera; 
    public static int y_schimb;
    public static int p_x;
    GreenfootSound mers_1 = new GreenfootSound("mers_1.mp3");
    GreenfootSound mers_2 = new GreenfootSound("mers_2.mp3");
    public int care_mers = 1;
    public static int bani;
    public int max_locuri = 4;
    public static int locuri_folosite = 0;
    public int image_nr;
    public boolean la_stanga ;
    private int timp_imagine = 12;
    private int asteptare_imagine = 1;
    public int imagine = 1;
    private GreenfootImage imageL1;
    private GreenfootImage imageR1;
    private GreenfootImage imageL2;
    private GreenfootImage imageR2;
    
    public Player()
    {
        imageL1 = new GreenfootImage("Personaj_1_L.png");
        imageR1 = new GreenfootImage("Personaj_1_R.png");
        imageL2 = new GreenfootImage("Personaj_2_L.png");
        imageR2 = new GreenfootImage("Personaj_2_R.png");
        setImage(imageR1);
    }
    
    public void act()
    {
        animatie();
        miscare_orizintala();
        miscare_verticala();
        p_x = getX();
        if(locuri_folosite == max_locuri)
        {
            if(Alegere_banca.imprumut !=true)
            {
                bani = bani - 25000 * 108 /100;
            }
            if(Alegere_banca.depozit !=true)
            {
                bani = bani + 25000 * 108 / 100;
            }
            Greenfoot.setWorld(new Terminat());
        }
        asteptare_imagine++;
    }
    
    public void sunet_mers()
    {
        if (!mers_1.isPlaying() && !mers_2.isPlaying()) 
        {
            if(care_mers == 8)
            {
                mers_1.play();
                care_mers = 2;
            }
            if(care_mers == 2)
            {
                mers_2.play();
                care_mers = 1;
            }
        }
    }
    
    public void miscare_orizintala()
    {
        setLocation(getX() + x_viteza / 2, getY());
        
        if (Greenfoot.isKeyDown("d"))
        {
            if (x_viteza < 0)
            {
                x_viteza += 1;
            }
            if (x_viteza < 10)
            {
                x_viteza += 1;
            }
            sunet_mers();
        }
        
        if (Greenfoot.isKeyDown("a"))
        {
            if (x_viteza > 0)
            {
                x_viteza -= 1;
            }
            if (x_viteza > - 10)
            {
                x_viteza -= 1;
            }
            sunet_mers();
        }
        
        if(!Greenfoot.isKeyDown("d") && x_viteza > 0)
        {
            x_viteza--;
        }
        
        if(!Greenfoot.isKeyDown("a") && x_viteza < 0)
        {
            x_viteza++;
        }
        
        if (!Greenfoot.isKeyDown("a") && !Greenfoot.isKeyDown("d"))
        {
            if (x_viteza > 0)
            {
                x_viteza -= 1;
            }
            if (x_viteza > 0)
            {
                x_viteza += 1;
            }
        }
        
        if (Greenfoot.isKeyDown("w"))
        {
            salt();
        }
    }
    
    public void miscare_verticala()
    {
        setLocation(getX(), getY()+y_viteza/4);
        
        if(y_viteza < 40)
        {
            y_viteza++;
        }
        
        while (getY() > y_podea)
        {
            setLocation(getX(), getY()-1);
            y_viteza = 0;
        }
        
        y_schimb = getY();
    }
    
    public void salt()
    {
        if(getY() == y_podea)
        {
            y_viteza -= s_putere - 1;
        }
    }
    
    private void animatie()
    {
        if (Greenfoot.isKeyDown("a"))
        {
            la_stanga = true;
            if (asteptare_imagine >= timp_imagine)//if it's time to change the image
            {
                image_nr++;

                if (image_nr == 3)//so we don't get an error
                {
                    image_nr = 1;
                }

                setImage("Personaj_" + image_nr + "_L.png");//it looks like we're walking
                imagine = image_nr;//so we can see what image we have
                asteptare_imagine = 0;
            }

            if (getImage() == imageR1)
            {
                setImage(imageL1);
                asteptare_imagine = 0;
            }
            if (getImage() == imageR2)
            {
                setImage(imageL1);
                asteptare_imagine = 0;
            }
        }

        if (imagine == 2  && !Greenfoot.isKeyDown("a"))//true
        {
            setImage(imageL1);
            imagine = 1;
        }

        if (Greenfoot.isKeyDown("d"))
        {
            la_stanga = false;
            if (asteptare_imagine >= timp_imagine)
            {
                image_nr++;
                if (image_nr == 3)
                {
                    image_nr = 1;
                }
                setImage("Personaj_" + image_nr + "_R.png");
                imagine = image_nr + 2;
                asteptare_imagine = 0;
            }

            if (imagine == 1)
            {
                setImage(imageR1);
                imagine = 3;
                asteptare_imagine = 0;
            }
            if (imagine == 2)
            {
                setImage(imageR1);
                imagine = 3;
                asteptare_imagine = 0;
            }

        }

        if (imagine == 4 && !Greenfoot.isKeyDown("d"))//false
        {
            setImage(imageR1);
            imagine = 3;
        }
    }
}
