package com.company;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 100, height = 100;

    public static BufferedImage player, dirt, grass, stone, tree, sheep;

    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Sheet.png"));

        player = sheet.crop(0, 0, width, height);
        grass = sheet.crop(width * 2, 0, width, height);
        dirt = sheet.crop(width * 3, 0 , width, height);
        stone = sheet.crop(width * 4, 0, width, height);
        tree = sheet.crop(0, height, width, height);
        sheep = sheet.crop(width, height, width, height);
    }
}
