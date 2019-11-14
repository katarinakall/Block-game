package com.company;

import java.awt.image.BufferedImage;

public class TreeTile extends Tile {

    public TreeTile(int id) {
        super(Assets.tree, id);
    }

    @Override
    public boolean isSolid(){
        return true;
    }
}
