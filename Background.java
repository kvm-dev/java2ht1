//дз ч.2
package ru.geekbrains.java2ht1;

import javax.swing.*;
import java.awt.*;

public class Background extends JPanel {
    long currTime;
    private static final int CHANGE_BG = 5000;



    Background(GameCanvas backcolor){

        //светофорим
        int r = (int) (Math.random()*2);
        if(r==0)
        {
            backcolor.setBackground(Color.green);
            System.out.println(r);
        }
        if(r==1)
        {
            backcolor.setBackground(Color.yellow);
            System.out.println(r);
        }
        else
        {
            backcolor.setBackground(Color.red);
        }
        // насколько я понял просто задержка выполнения
        try {
            Thread.sleep(CHANGE_BG);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //ни через backcolor ни присто без него не работает.. вызывается только один раз при создании канвы, другими словами с течением времени не получилось реализовать(
        // backcolor.repaint();

    }



}

