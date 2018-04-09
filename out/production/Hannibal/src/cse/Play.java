package cse;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {

    private int x1 = 100;
    Animation roman,carthaginian;
    boolean ex = false;
    float x = 0 , y = 0;
    int [] waitingtime = {300,300};

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
        g.drawImage(new Image("res/New Piskel (2)/Layer 1_sprite_1.png"), 200+x, 450);
        g.drawImage(new Image("res/New Piskel (2)/Layer 1_sprite_2.png"),300,450);
//        g.“SpriteSheet(Image image, int tw, int th);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {

        Input input = gc.getInput();
        if (input.isKeyDown(Input.KEY_RIGHT))
            x+=1*i;
        else if (input.isControllerLeft(Input.KEY_LEFT))
            x-=1*i;
    }
}


/// @2018