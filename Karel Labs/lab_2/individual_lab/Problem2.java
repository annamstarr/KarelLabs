package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        setPins();
        repositionHalf();
        setPinsTwo();
        finalPosition();
        turnOff();
    }
    public void setPins(){
        repositionOne();
        rowOne();
        repositionRight();
        rowTwo();
        repositionLeft();
        rowThree();
        repositionRight();
        rowFour();
    }
    public void  repositionOne() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void rowOne() {
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void repositionRight() {
        turnRight();
        move();
        turnRight();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void rowTwo() {
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void repositionLeft() {
        turnLeft();
        move();
        turnLeft();
    }
    public void rowThree() {
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void rowFour() {
        move();
        putBeeper();
    }
    public void repositionHalf(){
        turnRight();
        move();
        move();
        move();
        move();
        move();
    }
    public void setPinsTwo() {
        rowFour();
        repositionDownRight();
        rowThree();
        repositionDownLeft();
        rowTwo();
    }
    public void repositionDownRight() {
        turnRight();
        move();
        move();
        turnRight();
        move();
        turnRight();
    }
    public void repositionDownLeft() {
        move();
        move();
        turnLeft();
        move();
        turnLeft();
    }
    public void finalPosition() {
        turnRight();
        move();
        move();
        move();
        move();
        move();
        turnRight();
        move();
        move();
        turnLeft();
    }
}
