package Ch06;

import java.awt.*;

public class Sheep {
    private  int x;
    private int y;
    public Sheep(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return "the xy coordinate is"+x+"，"+y;
    }
    public void drawSheep(Graphics g){
        g.setColor(Color.black);
        g.fillOval(x+23,y+50,225,100);
        g.fillOval(x,y,75,75);
    }
}
