package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        setVerticals();
    }
    public void setVerticals() {
        vertical();
        repositionHOneToHTwo();
        vertical();
        repositionHToE();
        vertical();
        repositionEToLOne();
        vertical();
        repositionLOneToLTwo();
        vertical();
        repositionLTwoToOOne();
        vertical();
        repositionOOneToOTwo();
        vertical();
    }
    public void vertical() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    public void repositionHOneToHTwo() {
        turnRight();
        move();
        move();
        move();
        turnRight();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void repositionHToE() {
        turnLeft();
        move();
        move();
        turnLeft();
    }
    public void repositionEToLOne() {
        turnRight();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        move();
        turnRight();
    }
    public void repositionLOneToLTwo() {
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        move();
        turnLeft();
    }
    public void repositionLTwoToOOne() {
        turnRight();
        move();
        move();
        move();
        move();
        turnRight();
    }
    public void repositionOOneToOTwo() {
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
    }
}    