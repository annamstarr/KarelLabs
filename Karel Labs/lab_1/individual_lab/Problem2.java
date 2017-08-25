package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  A. Starr
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        pickUpBeepers();
        figureEight();
        putBeepers();
    }
   public void pickUpBeepers() {
       move();
       pickBeeper();
       move();
       move();
       pickBeeper();
       move();
    }
    public void figureEight() {
        turnLeft();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void putBeepers() {
        turnLeft();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        turnLeft();
        turnLeft();
    }
}