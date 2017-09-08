package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Problem2
{
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    } 
    public void enterRoom() {
        turnLeft();
        for(int i = 0; i < 4; i++) {
            if(frontIsClear()) {
                move();
                checkLeft();
                checkRight();
                faceNorth();
            }
        }  
    }
    public void leaveRoom() {
        faceSouth();
        while (frontIsClear()) {
            move();
                }
        }
    public void checkLeft() {
        faceWest();
        if (frontIsClear()) {
            leaveRoom();
        }
    }
    public void checkRight() {
        faceEast();
        if (frontIsClear()) {
            leaveRoom();
        }
    }
}
