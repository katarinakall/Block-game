package com.company;

import java.awt.*;

public abstract class State {

    private static State currentState = null;

    public static void setState(State state) {
        currentState = state;
    }

    public static State getState(){
        return currentState;
    }

    //Class
    public abstract void tick();
    public abstract void render(Graphics g);
}