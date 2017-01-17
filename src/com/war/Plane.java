package com.war;

/**
 * Created by 尹恒 on 2017/1/13.
 */
public abstract class Plane {
    int size;
    int count;
    int speed;
    int value;

    public abstract void left();

    public abstract  void right();

    public abstract void up();
    public abstract void down();
    public  abstract int crash();
}

class MyPlane extends Plane {
    public int value;
    public MyPlane(int size, int count, int speed, int value) {
        this.size = size;
        this.count = count;
        this.speed = speed;
        this.value = value;

    }

    public void left() {
        System.out.println("My plane left");
    }

    public void right() {
        System.out.println("My plane right");
    }

    public void up() {
        System.out.println("My plane up");
    }

    public void down() {
        System.out.println("My plane down");
    }

    public  int crash(){
        System.out.println("My plane crash");
        value = value - 5;
        return value;
    };

}

class TheirPlane extends Plane {
    public int value;
    public TheirPlane(int size,int count,int speed, int value) {
        this.size = size;
        this.count = count;
        this.speed = speed;
        this.value = value;

    }

    public void left() {
        System.out.println("Theis lett");
    }

    public void right() {
        System.out.println("Their plane right");
    }

    public void up() {
        System.out.println("their plane up");
    }

    public void down() {
        System.out.println("Their plane down");
    }

    public  int  crash(){
        System.out.println("Their plane crash");
        value = value - 5;
        return value;
    };

}
