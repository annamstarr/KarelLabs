package lab_3.individual_lab;

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
    public void carpetRooms() {
        carpetRoom();
        carpetRoom();
        carpetRoom();
        carpetRoom();
        carpetRoom();
        carpetRoom();
        carpetRoom();
        carpetRoom();
    }
    public void carpetRoom(){
        findRoom();
        enterRoom();
        if (checkCieling() && checkLeftWall() && checkRightWall()) {
            putBeeper();
        }
        leaveRoom();
        reset();
    }
    public void findRoom () {
        move();
    }
    public void enterRoom() {
        turnLeft();
        move();
    }
    public boolean checkLeftWall() {
        faceWest();
        if (frontIsClear()) {
            return false;
        }
        else {
            return true;
        }
    }
    public void faceWest() {
        while(!facingWest()) {
            turnLeft();
        }
    }
    public void faceSouth() {
        while(!facingSouth()) {
            turnLeft();
        }
    }
    public void faceNorth() {
        while(!facingNorth()) {
            turnLeft();
        }
    }
    public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    }
    public boolean checkRightWall() {
        faceEast();
        if (frontIsClear()) {
            return false;
        }
        else {
            return true;
        }
    }
    public boolean checkCieling() {
            faceNorth();
                if (frontIsClear()) {
                return false;
            }
            else {
                return true;
            }
        }
    public void leaveRoom() {
            faceSouth();
            move();
        }
    public void reset() {
            turnLeft();
        }
    }

