
package Lesson5;

import java.awt.Color;
import java.awt.Graphics;


public class Face {
    private int xPos, yPos, diameter;
    private Color cf, ce;
    private Graphics g;
    private boolean isHappy;
    
    public Face(Graphics g, int x, int y){
        xPos = x;
        yPos = y;
        //let the g property = the g param
        this.g = g;
        //default size and color
        diameter = 100;
        cf = Color.red;
        ce = Color.yellow;
        isHappy = true;
    }
    
    public void resize(int d){
        diameter = d;
    }
    
    public void setColor(Color cface, Color ceyes){
        cf = cface;
        ce = ceyes;
    }
    
    public void move(int x, int y){
        xPos = x;
        yPos = y;
    }
    
    public void toggleMood(boolean happy){
        if(happy == true)isHappy = false;
        else isHappy = true;
    }
    
    public void draw(){
        drawHead();
        drawEyes();
        drawMouth();
    }
    
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(xPos-10, yPos-10, diameter+20, diameter+20);
    }
        
    
    private void drawHead(){    
        g.setColor(cf);
        g.fillOval(xPos, yPos, diameter, diameter);
    }
    
    private void drawEyes(){
        g.setColor(ce);
        g.fillOval((int)(xPos+.2 * diameter), (int)(yPos+.15 * diameter), (int)(diameter*.3), (int)(diameter*.3));
        g.fillOval((int)(xPos+.55 * diameter), (int)(yPos+.15 * diameter), (int)(diameter*.3), (int)(diameter*.3));
        
    }
    
    private void drawMouth(){
        g.setColor(Color.black);
        if(isHappy == true){
        g.drawLine((int)(xPos+.2 * diameter), (int)(yPos+.6 * diameter), (int)(xPos+.3 * diameter), (int)(yPos+.8 * diameter));
        g.drawLine((int)(xPos+.3 * diameter), (int)(yPos+.8 * diameter), (int)(xPos+.7 * diameter), (int)(yPos+.8 * diameter));
        g.drawLine((int)(xPos+.7 * diameter), (int)(yPos+.8 * diameter), (int)(xPos+.8 * diameter), (int)(yPos+.6 * diameter));
        }
        else {
        g.drawLine((int)(xPos+.2 * diameter), (int)(yPos+.7 * diameter), (int)(xPos+.3 * diameter), (int)(yPos+.6 * diameter));
        g.drawLine((int)(xPos+.3 * diameter), (int)(yPos+.6 * diameter), (int)(xPos+.7 * diameter), (int)(yPos+.6 * diameter));
        g.drawLine((int)(xPos+.7 * diameter), (int)(yPos+.6 * diameter), (int)(xPos+.8 * diameter), (int)(yPos+.7 * diameter));
        }
    }
}
