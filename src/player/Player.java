package player;

import items.Item;
import room.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Player implements Observer {
    private String name;
    private int goldAmount =30;
    private Direction direction=Direction.east;
    private int directionToInt=0;
    private List<Item> playerItems = new ArrayList<Item>();
    Room CurrentRoom;

    private void setDirectionToInt(){
        if (direction==Direction.east)
            directionToInt=0;
        else if (direction==Direction.south)
            directionToInt=1;
        else if (direction==Direction.west)
            directionToInt=2;
        else if (direction==Direction.north)
            directionToInt=3;

    }
    public void turnLeft(){
        if (direction == Direction.north) direction = Direction.west;
        else if (direction == Direction.west) direction = Direction.south;
        else if (direction == Direction.south) direction = Direction.east;
        else if (direction == Direction.east) direction = Direction.north;
        setDirectionToInt();
    }
    public void turnRight() {
        if (direction == Direction.north) direction = Direction.east;
        else if (direction == Direction.east) direction = Direction.south;
        else if (direction == Direction.south) direction = Direction.west;
        else if (direction == Direction.west) direction = Direction.north;
        setDirectionToInt();
    }
    public void forward(){

    }
    //backward
    public void playerStatus(){
    System.out.println("You are facing "+direction);
    System.out.println("You have "+ goldAmount + " gold");
    //print keys and flashlight
    }


    @Override
    public void update(Observable o, Object arg) {//implement

    }
}
