package cse;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class Play extends BasicGameState implements KeyListener{

    private int x1 = 100;

    public Play(int state){

    }
    @Override
    public int getID() {
        return 1;
    }

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {

    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.setColor(Color.gray);
        g.fillRect(0,400,800,400-50);
        for (int j = 0; j < 18; j++) {
            g.drawImage(new Image("res/col.png"), 10+(j*40), 600);
            g.drawImage(new Image("res/col.png"),  10+(j*40), 550 - 200);
        }
        g.drawImage(new Image("res/New Piskel (2)/Layer 1_sprite_1.png"), x1, 450);
        g.drawImage(new Image("res/New Piskel (2)/Layer 1_sprite_3.png"),400,450);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
    }
}
