package com.war;

/**
 * Created by 尹恒 on 2017/1/13.
 */
public class Game {

int score = 0;

MyPlane m1 = new MyPlane(5,100,40,100);
Plane t1 = new TheirPlane(10,200,60,100);

public int getValue() {
    return m1.value;

}

public int getScore() {
    m1.crash();
    score = score - 1;
    t1.crash();
    score = score + 2;
    return score;
}


}
