package cse;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

import javax.swing.*;

public class Menu extends BasicGameState{
    JButton startgame;
    JButton exitgame;
    public Menu(int state){
    }
    @Override
    public int getID() {
        return 0;
    }

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        startgame = new JButton("Start");
        exitgame = new JButton("Exit");
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawImage(new Image("forest/1.png"),0,500);
        g.drawImage(new Image("forest/2.png"),0,500);
        g.drawImage(new Image("forest/3.png"),0,500);
        g.drawImage(new Image("forest/4.png"),0,500);
        g.drawImage(new Image("forest/1.png"),272,500);
        g.drawImage(new Image("forest/2.png"),272,500);
        g.drawImage(new Image("forest/3.png"),272,500);
        g.drawImage(new Image("forest/4.png"),272,500);
        g.drawImage(new Image("forest/1.png"),2*272,500);
        g.drawImage(new Image("forest/2.png"),2*272,500);
        g.drawImage(new Image("forest/3.png"),2*272,500);
        g.drawImage(new Image("forest/4.png"),2*272,500);
        g.setColor(Color.yellow);
        g.drawString("Are You Ready Roman ?",280,200);
    }
    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i ) throws SlickException {
    }
}
