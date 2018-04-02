package cse;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {

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
        g.fillRect(0,300,800,400-50);
//        for (int j = 0; j < 18; j++) {
//            g.drawImage(new Image("res/col.png"), 10+(j*40), 700);
//            g.drawImage(new Image("res/col.png"),  10+(j*40), 550 - 200);
//        }
        g.drawImage(new Image("res/Column.png"),0,100);
        g.drawImage(new Image("res/Column.png"),600-10,100);
        g.drawImage(new Image("res/New Piskel (2)/Layer 1_sprite_1.png"), 200+x1, 450);
        g.drawImage(new Image("res/New Piskel (2)/Layer 1_sprite_2.png"),300,450);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        if (input.isControllerRight(Input.KEY_RIGHT))
            x1-=1;
        if (input.isControllerLeft(Input.KEY_LEFT))
            x1+=1;
    }
}


/// @2018