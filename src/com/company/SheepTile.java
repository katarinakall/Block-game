package com.company;

public class SheepTile extends Tile {

    public SheepTile(int id) {
        super(Assets.sheep, id);
    }

    @Override
    public boolean isSolid(){
        return true;
    }
}

