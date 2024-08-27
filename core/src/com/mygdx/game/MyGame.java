package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.Screens.MainScreen;

public class MyGame extends Game {
    public MainScreen mainScreen;
    @Override
    public void create() {
        mainScreen = new MainScreen(this);
        setScreen(mainScreen);
    }
}
