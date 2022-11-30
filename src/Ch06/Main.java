package Ch06;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    Sheep s;
    public Main(){
        s=new Sheep(30,30);

    }
    @Override
    public  void  paintComponent(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0,0,getWidth(),getHeight());

    }
    public static void main(String[] args) {
        JFrame window=new JFrame();
        window.setSize(250,250);
        window.setContentPane(new Main());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);



        Sheep s=new Sheep(0,0);
        System.out.println(s);
    }

}
