package com.war;

/**
 * Created by 尹恒 on 2017/1/13.
 */
public class GameClient {
    public static void main(String[] arg) {
        int score;
        int myValue;
        Game game = new Game();
        score = game.getScore();
        myValue = game.getValue();
        System.out.println(score);
        System.out.println(myValue);

    }
}
