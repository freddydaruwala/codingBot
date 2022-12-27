package com.company;
class Base1{
    Base1() {
        System.out.println("I am a constructor"); }
    public int x;
    public int getX() {
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
}
class Derived extends  Base1 {
    public int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
           this.y = y;
    }
}

public class cwh_46_constructor {
    public static void main(String[] args) {
        Base1 b = new Base1();

    }
}
