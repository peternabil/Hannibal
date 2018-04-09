package cse;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {

    private int x1 = 100;
    Animation roman,roman2,carthaginian;
    boolean ex = false;
    float x = 0 , y = 0;
    int [] waitingtime = {300};

    public Play(int state){

    }
    @Override
    public int getID() {
        return 1;
    }

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        Image [] romansoldier = {new Image("res/New Piskel (3)/Layer 1_sprite_1.png")};
        roman = new Animation(romansoldier,waitingtime,false);
        Image [] romansoldier2 = {new Image("res/New Piskel (2)/Layer 1_sprite_1.png")};
        roman2 = new Animation(romansoldier2,waitingtime,false);
        Image [] cartigiansoldier = {new Image("res/New Piskel (2)/Layer 1_sprite_3.png")};
        carthaginian = new Animation(cartigiansoldier,waitingtime,false);

    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.setColor(Color.gray);
        g.fillRect(0,600+15,800,799-450);
        roman.draw(200+x, 450+y);
        g.drawImage(new Image("res/Column.png"),-10,50);
        g.drawImage(new Image("res/Column.png"),600-15,50);
    }
    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        if (input.isKeyDown(Input.KEY_RIGHT))
            x+=i*.1f;
        if (input.isKeyDown(Input.KEY_LEFT))
            x-=i*.1f;
    }
}


/// @2018